import java.util.List;
import java.util.Set;
import java.util.HashSet;
class GottaSnatchEmAll {
    
    static Set<String> newCollection(List<String> cards) {
      Set<String> set = new HashSet<>();
        set.addAll(cards);
        return set;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card)? true : false;
       
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if(myCollection.size()!=theirCollection.size()) return false;
        myCollection.removeAll(theirCollection);
        theirCollection.removeAll(myCollection);
        return  !myCollection.isEmpty() && !theirCollection.isEmpty();
    }

    static Set<String> commonCards(List<Set<String>> collections) {

        Set<String> result = new HashSet<>(collections.get(0));

        for (int i = 1; i < collections.size(); i++) {
            Set<String> currentSet = new HashSet<>(collections.get(i));
            result.retainAll(currentSet);
        }

        return result;
    }

    static Set<String> allCards(List<Set<String>> collections) {
         Set<String> totalCards = new HashSet<>();
        
        for (Set<String> collection : collections) {
            totalCards.addAll(collection);
        }
        
        return totalCards;
    }
}
