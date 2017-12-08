#!/bin/bash

for i in {1..100}
do
        if(( $(($i%13)) == 0 )); then
                echo $i
        fi
done
