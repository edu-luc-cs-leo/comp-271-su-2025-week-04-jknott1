# Week 04: Reflection on Week 3

I think this week was probably the closest I have gotten so far the given solutions. I'll break it down piece by peace here since there's quite a but to cover.

First was implementing more efficient count into the class. In this case, I followed exactly what we did in class: I added an extra integer class attribute to keep track of size. As such, rather than implementing a method to explicitly count size, size is implicitly counted using the add() functions.

Next, was the `indexOf()` method. This one was probably the most complex of them to implement. However, I think that I did pretty good work with this one. As posted in the solution, I created a while loop that while iterate under the same conditions. However, to keep one return statement, I implemented two indices - `index` which is the true index with a default of -1 and `i` which is the index of the cursor iterating through the list. If `i` is less than the length of the list after iteration, then `i`'s value is assigned to index. If not, it keeps the default value. Either way, `index` is returned.

The boolean `contains()` method was pretty simple. As the solution said, since `indexOf()` already detects if a station is in a TrainLine. As such, the method was a one-liner, returning the boolean value `this.indexOf(value) != -1`. The one thing I will say is that while I think my method works just fine, it would have made more sense to use `... > 0` instead. This is because (even though there shouldn't be a way for it to be so) any integer, including negative integers, will satisfy that condition so long as it's not -1. 

Other than that, my code worked the way that I wanted it to. It compiled without errors and passed all tests. What I think I should work on then is coding style and logic, especially going forward as the assignments become increasingly complex.