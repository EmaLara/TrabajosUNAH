import random
from google.oauth2.service_account import Credentials
from googleapiclient.discovery import build

# Define la función de ordenamiento de burbuja
def burbuja(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

# Define la función de ordenamiento de inserción
def insercion(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i-1
        while j >=0 and key < arr[j] :
                arr[j+1] = arr[j]
                j -= 1
        arr[j+1] = key

# Define la función de ordenamiento de selección
def seleccion(arr):
    for i in range(len(arr)):
        min_idx = i
        for j in range(i+1, len(arr)):
            if arr[min_idx] > arr[j]:
                min_idx = j
        arr[i], arr[min_idx] = arr[min_idx], arr[i]

# Carga las credenciales desde el archivo credentials.json
creds = Credentials.from_service_account_file('coastal-well-302417-b01c167cad9e.json')

# Construye el objeto de servicio de Google Sheets API
service = build('sheets', 'v4', credentials=creds)

# Define la ID de la hoja de Google Sheets
sheet_id = '1uCr3NiXQUdHmOs03zweLKIy2cYLx85Fq2oNvAzyknJk'

# Genera tres listas aleatorias
lista_a = random.sample(range(100), 10)
lista_b = random.sample(range(100), 10)
lista_c = random.sample(range(100), 10)

# Ordena las tres listas utilizando los tres algoritmos de ordenamiento
burbuja(lista_a)
insercion(lista_b)
seleccion(lista_c)

# Actualiza la hoja de Google Sheets con los valores ordenados
values = [
    lista_a,
    lista_b,
    lista_c
]
range_names = [
    'C1:C10',
    'B1:B10',
    'A1:A10'    
]
body = {
    'values': values
}
result = service.spreadsheets().values().batchUpdate(
    spreadsheetId=sheet_id, body={'valueInputOption': 'USER_ENTERED', 'data': [{'range': r, 'values': body['values']} for r in range_names]}).execute()

print('{0} celdas actualizadas en la hoja de Google Sheets.'.format(result.get('totalUpdatedCells')))
