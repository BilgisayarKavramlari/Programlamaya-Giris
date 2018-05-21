#!/bin/bash
echo "1. sayi:"
read birinci

echo "2. sayi:"
read ikinci

echo "3. sayi:"
read ucuncu

eb=$birinci
ek=$birinci

for i in $birinci $ikinci $ucuncu; do
	if (( $i > $eb )); then
		eb=$i
	fi
	if (( $i < $ek )); then
		ek=$i
	fi
done

echo "En Büyük $eb En Küçük $ek"
