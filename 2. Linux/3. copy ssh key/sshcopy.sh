# !/bin/sh

ssh_file_name=$(echo $1 | awk -F'/' '{print $NF}')
username=$2
ip=$3

# echo "scp $1 $username@$ip:/home/$username/.ssh/$ssh_file_name"
scp $1 $username@$ip:/home/$username/.ssh/$ssh_file_name
