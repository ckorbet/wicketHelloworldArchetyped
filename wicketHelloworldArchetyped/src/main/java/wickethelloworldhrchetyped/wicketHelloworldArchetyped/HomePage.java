package wickethelloworldhrchetyped.wicketHelloworldArchetyped;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.image.ContextImage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * Homepage
 */
public class HomePage extends WebPage {

	private static final long serialVersionUID = 1L;

	// TODO Add any page properties or variables here

    /**
	 * Constructor that is invoked when page is invoked without a session.
	 * 
	 * @param parameters Page parameters
	 */
    public HomePage(final PageParameters parameters) {
    	    	
    	final ContextImage myImg = new ContextImage("idImg", "apache-wicket.png");    	
    	add(myImg);

        // Add the simplest type of label
    	add(new Label("message", "If you see this message wicket is properly configured and running"));
        
    	final Label myLbl = new Label("idLbl", "My message");
    	add(myLbl);    	

        // TODO Add your page's components here
    }
}
