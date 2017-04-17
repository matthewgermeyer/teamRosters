package com.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    /*
    create a map with the team name as the key and the players names as the value


       "interesting map methods"
        get(key)
        put(key, value)
        remove(key)

e.g.
    Map<String, Pair> bowlGames = new HashMap<>();
        Pair pair = new Pair();
        pair.first = "Alabama";
        pair.second = "Clemson";
        bowlGames.put("Peach Bowl", pair);


e.g.

List<String> nameList = new ArrayList(badBabyNames.length + 4);
        for (String name : badBabyNames) {
            nameList.add(name);
        }

        System.out.print("List (list iterator): ");
        ListIterator<String> li = nameList.listIterator();
        while (li.hasNext()) {
            String name = li.next();
            System.out.print(name + ", ");
            if ("Nevaeh".equals(name)) {
                li.add("Elliot");
            }
        }

        Set<String> nameSet = new HashSet<>(nameList);

e.g. ---  Map<Integer, Set<String>> nameMap = new HashMap<>();
        nameMap.put(2016, nameSet);

 e.g. :
        List<String> arrayBackedList = Arrays.asList("one", "two", "three");

     */

    public static void main(String[] args) {
//        String fromTeam = args[0];
//        String playerName = args[1];
//        String toTeam = args[2];
        // args e.g. "spurs" "lamela" "chelsea"

        Map<String, Set<String>> teams = new HashMap<>();
        HashSet<String> roster = new HashSet<>(11);


        roster.add("Kane");
        roster.add("Alli");
        roster.add("Eriksen");
        roster.add("Son");
        roster.add("Dembele");
        roster.add("Wanyama");
        roster.add("Vertonghen");
        roster.add("Alderweireld");
        roster.add("Rose");
        roster.add("Walker");
        roster.add("Lloris");
        System.out.println(roster);
        System.out.println("roster isEmpty? " + roster.isEmpty());
        System.out.println("roster contains Walker? " + roster.contains("Walker"));
        if (roster.contains("Walker") == true) {
            System.out.println("Walker is back from injury and available to play!");
        } else
            System.out.println("Walker is out of the roster");

        System.out.println("The roster size is " + roster.size());
        System.out.println("Looks like Walker is Hurt again... I'll remove him from the roster \n");
        roster.remove("Walker");
        System.out.println(roster);
        System.out.println("roster.contains('walker') ? " + roster.contains("Walker"));

//Now lets make a Hashmap with the roster matched to the team name spurs.
        teams.clear();
        System.out.println("teams should be empty?  'teams.isEmpty()'? " + teams.isEmpty());

        teams.put("spurs", roster);
        System.out.println("putting 'spurs' into map, and associating it with the value 'roster' ");
        System.out.println(teams);


        /*   How to use HashSets --  instance methods :

        boolean	add(E e)
Adds the specified element to this set if it is not already present.
        void	clear()
Removes all of the elements from this set.

        boolean	contains(Object o)
  Returns true if this set contains the specified element.
boolean	isEmpty()
Returns true if this set contains no elements.



STUFF FOR MAPS:

boolean	isEmpty()
Returns true if this map contains no key-value mappings.
Set<K>	keySet()
Returns a Set view of the keys contained in this map.
V	merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)
If the specified key is not already associated with a value or is associated with null, associates it with the given non-null value.
V	put(K key, V value)
Associates the specified value with the specified key in this map.
void	putAll(Map<? extends K,? extends V> m)
Copies all of the mappings from the specified map to this map.
V	putIfAbsent(K key, V value)
If the specified key is not already associated with a value (or is mapped to null) associates it with the given value and returns null, else returns the current value.
V	remove(Object key)
Removes the mapping for the specified key from this map if present.
boolean	remove(Object key, Object value)
Removes the entry for the specified key only if it is currently mapped to the specified value.
V	replace(K key, V value)
Replaces the entry for the specified key only if it is currently mapped to some value.
boolean	replace(K key, V oldValue, V newValue)
Replaces the entry for the specified key only if currently mapped to the specified value.
void	replaceAll(BiFunction<? super K,? super V,? extends V> function)
Replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.
int	size()
Returns the number of key-value mappings in this map.


         */


    }

}
