package japidviews.more.MyController;
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
import japidviews._javatags.*;
//
// NOTE: This file was generated from: japidviews/more/MyController/doBodyInDefTag.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class doBodyInDefTag extends cn.bran.japid.template.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/more/MyController/doBodyInDefTag.html";
{
putHeader("Content-Type", "text/html; charset=utf-8");
}

// - add implicit fields with Play

	final Request request = Request.current(); 
	final Response response = Response.current(); 
	final Session session = Session.current();
	final RenderArgs renderArgs = RenderArgs.current();
	final Params params = Params.current();
	final Validation validation = Validation.current();
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(validation);
	final play.Play _play = new play.Play(); 

// - end of implicit fields with Play 


	public doBodyInDefTag() {
		super(null);
	}
	public doBodyInDefTag(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
public static final String[] argNames = new String[] {/* args of the template*/ };
public static final String[] argTypes = new String[] {/* arg types of the template*/ };
public static final Object[] argDefaults= new Object[] { };
public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.more.MyController.doBodyInDefTag.class);
{
	setRenderMethod(renderMethod);
	setArgNames(argNames);
	setArgTypes(argTypes);
	setArgDefaults(argDefaults);
}
////// end of named args stuff

public cn.bran.japid.template.RenderResult render(DoBody body, cn.bran.japid.compiler.NamedArgRuntime... named) {
    Object[] args = buildArgs(named, body);
    return runRenderer(args);
}

	DoBody body;
public static interface DoBody<A,B> {
		void render(A a,B b);
		void setBuffer(StringBuilder sb);
		void resetBuffer();
}
<A,B> String renderBody(A a,B b) {
		StringBuilder sb = new StringBuilder();
		if (body != null){
			body.setBuffer(sb);
			body.render( a, b);
			body.resetBuffer();
		}
		return sb.toString();
	}
	public cn.bran.japid.template.RenderResult render(DoBody body) {
		this.body = body;
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
//------
p("outside: ");// line 1
if (body != null){
	body.setBuffer(getOut());

	body.render("taggy", 1);
	body.resetBuffer();
}
p("\n" + 
"ok, try to get the content as method call: \n" + 
"   ");// line 1
p(renderBody("taddy", 3));// line 5
p("\n");// line 5
// line 7
p("call the def\n" + 
"\n");// line 9
p(foo());// line 12
p("\n");// line 12

	}

public String foo() {
StringBuilder sb = new StringBuilder();
StringBuilder ori = getOut();
this.setOut(sb);
// line 7
p("	hello ");// line 7
if (body != null){
	body.setBuffer(getOut());

	body.render("saddy", 2);
	body.resetBuffer();
}

this.setOut(ori);
return sb.toString();
}
}