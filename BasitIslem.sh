#!/bin/bash
toplama=$((5+3))
cikarma=$((10-5))
carpim=$((2*50))
bolum=$((6/2))
mod=$((13%2))

echo Toplama $toplama
echo Cikarma $cikarma
echo Carpim $carpim
echo Bolum $bolum
echo Mod $mod

echo Bir sayi girin:
read girilen

if(( $(($girilen%2)) == 0 )); then
        echo Sayi Cift
else
        echo Sayi Tek
