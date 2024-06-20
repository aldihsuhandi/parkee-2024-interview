# !/bin/sh

input_folder=$1
output_folder=$2
backup_output_name=$(echo $input_folder | awk -F'/' '{print $NF}')

output="$output_folder/$backup_output_name.tar.gz"

# echo "$input_folder, $output_folder, $backup_output_name"

tar -czvf $output -C $input_folder .
