month_days = {
    "january": 31, "march": 31, "may": 31, "july": 31,
    "august": 31, "october": 31, "december": 31,
    "april": 30, "june": 30, "september": 30, "november": 30,"december":31
}

month = input("Enter month name: ")
if month == "february":
    year = int(input("Enter year: "))
    if (year % 400 == 0) or (year % 4 == 0 and year % 100 != 0):
        print("February", year, "has 29 days.")
    else:
        print("February", year, "has 28 days.")
elif month in month_days:
    print(month.capitalize(), "has", month_days[month], "days.")
else:
    print("Invalid month name.")
