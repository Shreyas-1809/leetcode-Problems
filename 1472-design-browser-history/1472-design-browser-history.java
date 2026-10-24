class BrowserHistory {

    BrowserHistory next = null;
    BrowserHistory prev = null;

    BrowserHistory current = null ;

    String url;


    public BrowserHistory(String homepage) {
        current = new BrowserHistory();
        current.url = homepage;
    }
    public BrowserHistory()
    {

    }
    
    public void visit(String url) {
        BrowserHistory newbrowser = new BrowserHistory();
        newbrowser.url = url;
        
        current.next = newbrowser;
        newbrowser.prev = current;

        current = newbrowser;
    }
    
    public String back(int steps) {
        for(int i =1;i<=steps;i++)
        {
            if(current.prev!=null)
            current = current.prev;
        }
        return current.url;

        
    }
    
    public String forward(int steps) {
        for(int i =1;i<=steps;i++)
        {
            if(current.next!=null)
            current = current.next;
        }
        return current.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */