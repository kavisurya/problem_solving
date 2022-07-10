import pyautogui
import time

# print(pyautogui.size())

while True:
    pyautogui.moveTo(650, 350,  duration=5,)
    time.sleep(3)
    pyautogui.moveTo(350, 650,  duration=5,)
    time.sleep(3)
