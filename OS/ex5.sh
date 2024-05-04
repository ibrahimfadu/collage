while :
do
echo Menu
echo 1.To copy the file
echo 2.To remove the file
echo 3.To rename the file 
echo 4.To Exit
read ch
case $ch in 
1)read -p "Enter the file name to copy " f1
read -p "Enter file where to copy " f2
if [ -f $f1 ]
then 
cp $f1 $f2
echo The $f1 is copied successful to $f2
else
echo The $f1 file not found
fi
;;
2)read -p "Enter the filename to remove " f1
if [ -f $f1 ]
then 
rm $f1
echo The $f1 removed 
else
echo The $f1 is not found
fi
;;
3)read -p "Enter the filename :" f1
read -p "Enter the new name to file :" f2
if [ -f $f1 ]
then
mv $f1 $f2
echo The filename change to $f1 to $f2
else
echo The file $f1 not found
fi
;;
4)echo "Exit"
exit
;;
esac
done

