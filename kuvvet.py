taban = eval(input("Tabanı Giriniz:"))
us = eval(input("Üssü Giriniz:"))
sonuc = 1

for pff in range(us):
  sonuc = taban * sonuc
print("Sonuç =",sonuc)
