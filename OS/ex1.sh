#Biggest of three numbers
read -p "Enter three number :" a b c
if (($a>$b && $a>$c));
then
	big=$a
elif (($b>$a && $b>$c));
then
	big=$b
elif (($c>$a && $c>b));
then
	big=$c
else
break
fi
echo The biggest among $a $b $c is $big
