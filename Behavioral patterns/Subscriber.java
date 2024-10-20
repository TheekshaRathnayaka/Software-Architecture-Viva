import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Subscriber {
    void update(String news);
}

// Concrete Observer
class NewsSubscriber implements Subscriber {
    private String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    public void update(String news) {
        System.out.println(name + " received news: " + news);
    }
}

// Subject
class NewsAgency {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String latestNews;

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(latestNews);
        }
    }

    public void setNews(String news) {
        this.latestNews = news;
        notifySubscribers();
    }
}

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Subscriber subscriber1 = new NewsSubscriber("Subscriber 1");
        Subscriber subscriber2 = new NewsSubscriber("Subscriber 2");

        agency.addSubscriber(subscriber1);
        agency.addSubscriber(subscriber2);

        agency.setNews("Breaking News: New Observer Pattern Example Released!");
    }
}

