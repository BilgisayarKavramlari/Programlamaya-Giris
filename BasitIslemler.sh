#!/bin/bash
echo "Lütfen birinci sayıyı giriniz: "
read a

echo "Lütfen ikinci sayıyı giriniz: "
read b

echo "Toplam: $((a+b))"
echo "Fark:   $((a-b))"
echo "Çarpım: $((a*b))"
echo "Bölüm:  $((a/b))"
echo "Kalan:  $((a%b))"
