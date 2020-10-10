package pluralsight.m6.pages.search;

public class SearchPage {

    private SearchActController act;
    private SearchVerifyController verify;

    private SearchGetController get;

    public SearchGetController get(){
        return get;
    }

    public SearchActController act(){
        return act;
    }

    public SearchVerifyController verify(){
        return verify;
    }

    private SearchPage(SearchActController act, SearchVerifyController verify, SearchGetController get){
        this.act = act;
        this.verify = verify;
        this.get = get;
    }

    private SearchPage(){
        // hide it
    }

    public static SearchPage getSearchPage(){ //instance static to create SearchPages with acts and verifies
        return new SearchPage(new SearchActController(), //this way we force to use act or verify
                              new SearchVerifyController(),
                              new SearchGetController());
    }

}
