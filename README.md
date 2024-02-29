# CODELAB GENERICS JAVA
Membuat sebuah kelas generik bernama Box, yang dapat menyimpan nilai dari satu 
jenis data. Dalam contoh ini, kita akan menggunakan tipe data integer.
### Class Box "generics T"
- Class Box adalah kelas generik dengan parameter tipe T, yang memungkinkan kita untuk 
menggunakan tipe data yang berbeda tanpa perlu membuat kelas yang berbeda.
-  Kelas ini memiliki satu atribut private value dengan tipe T untuk menyimpan nilai generik.
### Method setValue, getValue, dan display
- setValue digunakan untuk menyimpan nilai ke dalam objek Box.
- getValue digunakan untuk mengambil nilai dari objek Box.
- display digunakan untuk menampilkan nilai yang disimpan dalam objek Box
### Method main
- Membuat objek Box "generics integer" dan Box "generics integer" bernama integerBox dan stringBox untuk menyimpan nilai bertipe Integer dan String.
- Memanggil method setValue(42) dan setValue(“Hello generics”) untuk menyimpan nilai 
ke dalam integerBox dan stringBox.
- Memanggil method getValue untuk mengambil nilai dari integerBox dan stringBox.
