#!/bin/bash
echo "Bugünün tarihini 'yıl' olarak giriniz: "
read tarih

echo "Yaşınızı giriniz: "
read yas

echo "Bugünün Tarihi: "$tarih 
echo "Yaşınız: "$yas
echo "Doğum Gününüz: "$((tarih-yas))
