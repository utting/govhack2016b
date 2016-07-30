__author__ = 'utting'
import csv

DATA_FILE = "business-discount-directory.csv"

suburb = "CALOUNDRA" # input("Suburb:").upper()
category = input("Category (Takeaway/Cafes/Hearing/...").upper()
infile = open(DATA_FILE, "r")
dictReader = csv.DictReader(infile)
#print("FIELDS:", dictReader.fieldnames)
for line in dictReader:
    if line["Outlet Suburb"] == suburb and line["Business Category"].upper().startswith(category):
        name = line["Trading Name"].strip()
        addr = line["Outlet Address"].strip()
        disc = line["Discount"].strip()
        print('''"{} at {} offers {}",'''.format(name, addr, disc))

