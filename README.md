# codewars-java-Challenges
Challenges Attempted in CodeWars for Java

### Challenge 1 => String Split
    Description => Complete the solution so that it splits the string into pairs of two characters. 
    If the string contains an odd number of characters then it should replace the missing second character 
    of the final pair with an underscore ('_')

    Ideal Solution =>
    s = (s.length() % 2 == 0) ? s : s+'_';
    return s.split("(?<\\G.{2}");
