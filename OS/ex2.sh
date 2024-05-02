while :
do
echo "*********************************"
echo "Menu"
echo "1.To find the length of the String"
echo "2.To concatinate two Strings"
echo "3.To compare two Strings"
echo "4.To exit"
read -p "Enter your choice" ch
case $ch in
1)echo Enter your String
read s1
len=`expr length "$s1"`
echo The length of the two strings are $len
;;
2)read -p "Enter first String " s1
read -p "Enter Second String " s2
echo The Concatinated Strings are $s1$s2
;;
3)read -p "Enter the first String " s1
read -p "Enter the second String " s2
if [ $s1 = $s2 ]
then 
	echo The strings are same
else
echo The Strings are not same
fi
;;
4)echo "Exit"
exit
;;
esac 
done
