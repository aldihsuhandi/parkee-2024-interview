# !/bin/sh

find $1 -maxdepth 1 -name "*.$2" -printf "%f\n"
