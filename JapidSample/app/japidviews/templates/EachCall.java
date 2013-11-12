//version: 0.9.36
package japidviews.templates;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import japidviews._layouts.*;
import play.i18n.Messages;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import play.mvc.Http.*;
import controllers.*;
//
// NOTE: This file was generated from: japidviews/templates/EachCall.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class EachCall extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/templates/EachCall.html";
	{
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
		setTraceFile(true);
	}

// - add implicit fields with Play

	final play.mvc.Http.Request request = play.mvc.Http.Request.current(); 
	final play.mvc.Http.Response response = play.mvc.Http.Response.current(); 
	final play.mvc.Scope.Session session = play.mvc.Scope.Session.current();
	final play.mvc.Scope.RenderArgs renderArgs = play.mvc.Scope.RenderArgs.current();
	final play.mvc.Scope.Params params = play.mvc.Scope.Params.current();
	final play.data.validation.Validation validation = play.data.validation.Validation.current();
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(validation);
	final play.Play _play = new play.Play(); 

// - end of implicit fields with Play 


	public EachCall() {
		super((StringBuilder)null);
	}
	public EachCall(StringBuilder out) {
		super(out);
	}
	public EachCall(cn.bran.japid.template.JapidTemplateBaseWithoutPlay caller) {
		super(caller);
	}

/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"posts",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"List<String>",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.templates.EachCall.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private List<String> posts; // line 4, japidviews/templates/EachCall.html
	public cn.bran.japid.template.RenderResult render(List<String> posts) {
		this.posts = posts;
		setStopwatchOn();
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 4, japidviews/templates/EachCall.html
		return getRenderResult();
	}

	public static cn.bran.japid.template.RenderResult apply(List<String> posts) {
		return new EachCall().render(posts);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
;// line 1, EachCall.html
p("\n");// line 2, EachCall.html
		p("<p>\n" + 
"The \"each/Each\" command is a for loop on steroid, with lots of loop information. \n" + 
"Now deprecated. \n" + 
"</p>\n" + 
"\n" + 
"<p> \n" + 
"The instance variable is defined after the | line, the same way as any tag render-back\n" + 
"</p>\n");// line 5, EachCall.html
		logDuration("1");// line 14, EachCall.html

new Runnable() {public void run() {
int _size = -100; int _index = 0; boolean _isOdd = false; String _parity = ""; boolean _isFirst = true; Boolean _isLast = _index == _size;
for (String p : posts) { // line 16, EachCall.html
	_index++; _isOdd = !_isOdd; _parity = _isOdd? "odd" : "even"; _isFirst = _index == 1; if (_size == -100) _size = getCollectionSize(posts); _isLast = (_size < 0 ? null : _index == _size);
// line 16, EachCall.html
		p("    <p>index: ");// line 16, EachCall.html
		p(_index);// line 17, EachCall.html
		p(", is odd? ");// line 17, EachCall.html
		p(_isOdd);// line 17, EachCall.html
		p(", is first? ");// line 17, EachCall.html
		p(_isFirst);// line 17, EachCall.html
		p(", is last? ");// line 17, EachCall.html
		p(_isLast);// line 17, EachCall.html
		p(", total size: ");// line 17, EachCall.html
		p(_size);// line 17, EachCall.html
		p(" </p>\n");// line 17, EachCall.html
		p("\n");// line 20, EachCall.html
		
}
}}.run();
// line 16, EachCall.html
logDuration("1.1");// line 22, EachCall.html

new SampleTag(EachCall.this).render("end"); // line 24, EachCall.html// line 24, EachCall.html
logDuration("2");// line 25, EachCall.html

for(String p : posts){// line 27, EachCall.html
		p("    <p> post: ");// line 27, EachCall.html
		p(p);// line 28, EachCall.html
		p(" </p>\n" + 
"   ");// line 28, EachCall.html
		p("\n");// line 31, EachCall.html
		}// line 32, EachCall.html
logDuration("3");// line 33, EachCall.html
		p("\n" + 
"<p> now we have an enhanced for loop (the \"open for loop\") that also makes all the loop properties available</p>\n" + 
"\n");// line 33, EachCall.html
		int k = 1;// line 37, EachCall.html
new Runnable() {public void run() {
int _size = -100; int _index = 0; boolean _isOdd = false; String _parity = ""; boolean _isFirst = true; Boolean _isLast = _index == _size;
for (String p : posts) { // line 38, EachCall.html
	_index++; _isOdd = !_isOdd; _parity = _isOdd? "odd" : "even"; _isFirst = _index == 1; if (_size == -100) _size = getCollectionSize(posts); _isLast = (_size < 0 ? null : _index == _size);
// line 38, EachCall.html
		p("    <p>index: ");// line 38, EachCall.html
		p(_index);// line 39, EachCall.html
		p(", parity: ");// line 39, EachCall.html
		p(_parity);// line 39, EachCall.html
		p(", is odd? ");// line 39, EachCall.html
		p(_isOdd);// line 39, EachCall.html
		p(", is first? ");// line 39, EachCall.html
		p(_isFirst);// line 39, EachCall.html
		p(", is last? ");// line 39, EachCall.html
		p(_isLast);// line 39, EachCall.html
		p(", total size: ");// line 39, EachCall.html
		p(_size);// line 39, EachCall.html
		p(" </p>\n" + 
"    call a tag:  ");// line 39, EachCall.html
		new SampleTag(EachCall.this).render(p); // line 40, EachCall.html// line 40, EachCall.html

}
}}.run();
// line 38, EachCall.html
		p("\n" + 
"<p>the collection variable must be final</p>\n" + 
"\n");// line 41, EachCall.html
		final int[] ints = {1, 2, 3, 4, 5};// line 45, EachCall.html
new Runnable() {public void run() {
int _size = -100; int _index = 0; boolean _isOdd = false; String _parity = ""; boolean _isFirst = true; Boolean _isLast = _index == _size;
for (Integer i : ints) { // line 46, EachCall.html
	_index++; _isOdd = !_isOdd; _parity = _isOdd? "odd" : "even"; _isFirst = _index == 1; if (_size == -100) _size = getCollectionSize(ints); _isLast = (_size < 0 ? null : _index == _size);
// line 46, EachCall.html
    if (i == 2) {// line 47, EachCall.html
        continue;// line 48, EachCall.html
    } else if (i == 5 ) {// line 49, EachCall.html
    	break;// line 50, EachCall.html
    }else {// line 51, EachCall.html
		p("         ");// line 51, EachCall.html
		p(i);// line 52, EachCall.html
		p(">\n" + 
"    ");// line 52, EachCall.html
		}// line 53, EachCall.html

}
}}.run();
// line 46, EachCall.html
logDuration("ddd");// line 55, EachCall.html
		;// line 55, EachCall.html
		
		endDoLayout(sourceTemplate);
	}

}