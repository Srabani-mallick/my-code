def generate_bill(item, price, quantity=1, discount=0, tax_rate=0.05):
    subtotal = price * quantity
    discount_amt = subtotal * (discount / 100)
    after_discount = subtotal - discount_amt
    tax = after_discount * tax_rate
    total = after_discount + tax

    print("\n--- BILL SUMMARY ---")
    print("Item:", item)
    print("Quantity:", quantity)
    print("Price per item:", price)
    print("Discount:", discount, "%")
    print("Tax Rate:", tax_rate * 100, "%")
    print("Total Payable:", total, "\n")

generate_bill("Laptop", 50000)
generate_bill("Laptop", 50000, 2)
generate_bill("Laptop", 50000, discount=10, tax_rate=0.05)
generate_bill("Laptop", 50000, 2, 10, 0.05)
