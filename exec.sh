#!/bin/bash
declare -i count
count = 0
#echo "$1"
for f in "entrada"/*; do

    #echo "$1/$f"
    /usr/lib/jvm/jdk-22-oracle-x64/bin/java @/tmp/cp_cc2zf8s0h17461uvtnii4b48e.argfile com.dc.ufscar.compiladores.lexico.Principal "$f" > ./outs/out"$count".out          
    #echo "$count"
    
    count=$((count+1))     
done
count =0
for file in "outs"/*;do
 diff "$file" "saida/"$count"-"*
 count=$((count+1))
 if [ $count -eq 38 ]
   then
      break
   fi
done