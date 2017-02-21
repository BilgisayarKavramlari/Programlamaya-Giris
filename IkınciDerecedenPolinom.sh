#!/bin/bash
echo "a sayısını giriniz: "
read a

echo "b sayısını giriniz: "
read b

echo "c sayısını giriniz: "
read c

echo "Sonuç: "$(((a**2)+(b**2)+(c*3))) # a kare artı b kare artı 3 çarpı c
