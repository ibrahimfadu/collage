echo Enter the filename
read file
c=`cat $file | wc -c`
w=`cat $file | wc -w`
l=`grep -c "." $file`

echo The characters in the $file is $c
echo The words in the $file is $w
echo The lines in the $file is $l
