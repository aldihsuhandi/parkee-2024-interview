# !/bin/sh

warning_limit=80

drive_health_check() {
  readarray -t disk_usages <<< $(df --output=source,pcent | tail -n +2 | awk '{print $1","$2}')
  
  for disk_usage in "${disk_usages[@]}"; do
    # echo $disk_usage
  
    IFS=',' read -r device_name usage_percentage <<< "$disk_usage"
    usage_percentage=${usage_percentage%?}
    # echo  "$device_name, $usage_percentage"
    if [ $usage_percentage -ge $warning_limit ]; then
        # echo $usage_percentage
        notify-send "$device_name usage is more than $warning_limit%"
    fi
  done
}

drive_health_check
