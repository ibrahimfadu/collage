echo `date`
mem_usage() {
mem_free=`free -m | grep "Mem" | awk '{print$3}'`
echo The memory space remaining $mem_free MB
 
if [ $mem_free -lt 0 ];
then
echo Memory warning
else
echo Memory is free
fi
}
mem_usage
