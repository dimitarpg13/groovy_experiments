excerpt = "At school, Harry had no one. Everybody knew that Dudley's gang hated the odd Harry Potter"+
          " in his baggy old clothes and broken glasses, and nobody liked to disagree with Dudley's gang";
matcher = (excerpt =~ /Harry Potter/);
excerpt = matcher.replaceAll("Tanya Grotter");

matcher = (excerpt =~ /Harry/);
excerpt = matcher.replaceAll("Tanya");
println("Publish it! "+excerpt);
