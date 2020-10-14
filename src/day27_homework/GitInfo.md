#Git information 

Creating pull request/update on previously forked project.

##update
````bash
git checkout master
git status 
# See if your up to date with upstream
git remote -v 
git fetch upstream
git rebase upstream/master master 
````
##create a new branch
````bash
git checkout -b (name of a new branch)
#create a directory, where we will work
#create needed java class, ect. that we will send later
````
##create a pull request
````bash
git status
git add (directory/files that we have created before)
git status
git commit -m "Commit message"
git status
git push origin (name of a new branch)
# follow the link in terminal/go to your repasitory
# create and pull request
# in comments, use # with number/name of an issue, 
# where you want to show up your request
````

