names = [
    "Graham James Edward Miller",
    "Andrew Gregory Macintyre"
]

printClosure = {
    matcher = (it =~ /(.*?)(?: .+)+ (.*)/); // non-matching group in the middle
    if (matcher.matches())
        println(matcher[0][2]+", "+matcher[0][1]);
}

names.each(printClosure);
