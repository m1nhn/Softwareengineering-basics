#!/bin/bash
svn status > diff.temp

for class in "$@"
do
	grep "${class}" diff.temp > /dev/null

	if [[ $? == 0 ]]; then
    	svn add * --force
    	svn commit -m 'makefile commit'
	fi
done

rm -f diff.temp