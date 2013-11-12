//version: 0.9.36
package japidviews._notifiers.TestEmailer;
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
// NOTE: This file was generated from: japidviews/_notifiers/TestEmailer/emailme.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class emailme extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_notifiers/TestEmailer/emailme.html";
	{
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
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


	public emailme() {
		super((StringBuilder)null);
	}
	public emailme(StringBuilder out) {
		super(out);
	}
	public emailme(cn.bran.japid.template.JapidTemplateBaseWithoutPlay caller) {
		super(caller);
	}

/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"post",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"models.japidsample.Post",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._notifiers.TestEmailer.emailme.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private models.japidsample.Post post; // line 1, japidviews/_notifiers/TestEmailer/emailme.html
	public cn.bran.japid.template.RenderResult render(models.japidsample.Post post) {
		this.post = post;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 1, japidviews/_notifiers/TestEmailer/emailme.html
		return getRenderResult();
	}

	public static cn.bran.japid.template.RenderResult apply(models.japidsample.Post post) {
		return new emailme().render(post);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
;// line 1, emailme.html
		p("\n" + 
"Hello ");// line 1, emailme.html
		p(post.title);// line 3, emailme.html
		p("!");// line 3, emailme.html
		
		endDoLayout(sourceTemplate);
	}

}