import random
import time
from google.oauth2 import service_account
from googleapiclient.discovery import build

# Credenciales de servicio
creds = service_account.Credentials.from_service_account_file('coastal-well-302417-b01c167cad9e.json')

# ID de la hoja de Google Sheets
sheet_id = '1uCr3NiXQUdHmOs03zweLKIy2cYLx85Fq2oNvAzyknJk'

# Función para ordenamiento de burbuja
def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

# Función para ordenamiento por inserción
def insertion_sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i-1
        while j >=0 and key < arr[j] :
                arr[j+1] = arr[j]
                j -= 1
        arr[j+1] = key

# Función para ordenamiento por selección
def selection_sort(arr):
    for i in range(len(arr)):
        min_idx = i
        for j in range(i+1, len(arr)):
            if arr[min_idx] > arr[j]:
                min_idx = j
        arr[i], arr[min_idx] = arr[min_idx], arr[i]

# Genera una lista aleatoria de 10 elementos
arr = [random.randint(1, 100) for i in range(10)]

# Ordena la lista con cada uno de los algoritmos de ordenamiento
bubble_sort(arr)
insertion_sort(arr)
selection_sort(arr)

# Crea el servicio de Google Sheets
service = build('sheets', 'v4', credentials=creds)

# Actualiza la hoja de Google Sheets con los resultados
values = [[str(i) for i in arr]]
result = service.spreadsheets().values().update(
    spreadsheetId=sheet_id,
    range='A1',
    valueInputOption='RAW',
    body={'values': values}
).execute()

print(result)
