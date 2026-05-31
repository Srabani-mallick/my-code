n = int(input("Enter a decimal number: "))

binary = bin(n)[2:]
octal = oct(n)[2:]
hexa = hex(n)[2:]

print("Binary:", binary, "(", len(binary), "digits )")
print("Octal:", octal, "(", len(octal), "digits )")
print("Hexadecimal:", hexa, "(", len(hexa), "digits )")

print("\nReconverted:")
print("Binary → Decimal:", int(binary, 2))
print("Octal → Decimal:", int(octal, 8))
print("Hex → Decimal:", int(hexa, 16))
