/*
YUI 3.13.0 (build 508226d)
Copyright 2013 Yahoo! Inc. All rights reserved.
Licensed under the BSD License.
http://yuilibrary.com/license/
*/

YUI.add("plugin",function(e,t){function n(t){!this.hasImpl||!this.hasImpl(e.Plugin.Base)?n.superclass.constructor.apply(this,arguments):n.prototype.initializer.apply(this,arguments)}n.ATTRS={host:{writeOnce:!0}},n.NAME="plugin",n.NS="plugin",e.extend(n,e.Base,{_handles:null,initializer:function(e){this._handles=[]},destructor:function(){if(this._handles)for(var e=0,t=this._handles.length;e<t;e++)this._handles[e].detach()},doBefore:function(e,t,n){var r=this.get("host"),i;return e in r?i=this.beforeHostMethod(e,t,n):r.on&&(i=this.onHostEvent(e,t,n)),i},doAfter:function(e,t,n){var r=this.get("host"),i;return e in r?i=this.afterHostMethod(e,t,n):r.after&&(i=this.afterHostEvent(e,t,n)),i},onHostEvent:function(e,t,n){var r=this.get("host").on(e,t,n||this);return this._handles.push(r),r},onceHostEvent:function(e,t,n){var r=this.get("host").once(e,t,n||this);return this._handles.push(r),r},afterHostEvent:function(e,t,n){var r=this.get("host").after(e,t,n||this);return this._handles.push(r),r},onceAfterHostEvent:function(e,t,n){var r=this.get("host").onceAfter(e,t,n||this);return this._handles.push(r),r},beforeHostMethod:function(t,n,r){var i=e.Do.before(n,this.get("host"),t,r||this);return this._handles.push(i),i},afterHostMethod:function(t,n,r){var i=e.Do.after(n,this.get("host"),t,r||this);return this._handles.push(i),i},toString:function(){return this.constructor.NAME+"["+this.constructor.NS+"]"}}),e.namespace("Plugin").Base=n},"3.13.0",{requires:["base-base"]});
YUI.add("moodle-core-lockscroll",function(e,t){e.namespace("M.core").LockScroll=e.Base.create("lockScroll",e.Plugin.Base,[],{_enabled:!1,destructor:function(){this.disableScrollLock()},enableScrollLock:function(t){if(this.isActive())return;var n=this.get("host").get("boundingBox").get("region").height,r=e.config.win.innerHeight||e.config.doc.documentElement.clientHeight||0;if(!t&&n>r-10)return;this._enabled=!0;var i=e.one(e.config.doc.body);i.addClass("lockscroll");var s=parseInt(i.getAttribute("data-activeScrollLocks"),10)||0,o=s+1;return i.setAttribute("data-activeScrollLocks",o),this},disableScrollLock:function(){if(this.isActive()){this._enabled=!1;var t=e.one(e.config.doc.body),n=parseInt(t.getAttribute("data-activeScrollLocks"),10)||1,r=n-1;n===1&&t.removeClass("lockscroll"),t.setAttribute("data-activeScrollLocks",n-1)}return this},isActive:function(){return this._enabled}},{NS:"lockScroll",ATTRS:{}})},"@VERSION@",{requires:["plugin","base-build"]});
YUI.add("moodle-core-notification-alert",function(e,t){var n,r,i,s,o,u,a;n="moodle-dialogue",r="notificationBase",i="yesLabel",s="noLabel",o="title",u="question",a={BASE:"moodle-dialogue-base",WRAP:"moodle-dialogue-wrap",HEADER:"moodle-dialogue-hd",BODY:"moodle-dialogue-bd",CONTENT:"moodle-dialogue-content",FOOTER:"moodle-dialogue-ft",HIDDEN:"hidden",LIGHTBOX:"moodle-dialogue-lightbox"},M.core=M.core||{};var f="Moodle alert",l;l=function(e){e.closeButton=!1,l.superclass.constructor.apply(this,[e])},e.extend(l,M.core.dialogue,{_closeEvents:null,initializer:function(){this._closeEvents=[],this.publish("complete");var t=e.Node.create('<input type="button" id="id_yuialertconfirm-'+this.get("COUNT")+'" value="'+this.get(i)+'" />'),n=e.Node.create('<div class="confirmation-dialogue"></div>').append(e.Node.create('<div class="confirmation-message">'+this.get("message")+"</div>")).append(e.Node.create('<div class="confirmation-buttons"></div>').append(t));this.get(r).addClass("moodle-dialogue-confirm"),this.setStdModContent(e.WidgetStdMod.BODY,n,e.WidgetStdMod.REPLACE),this.setStdModContent(e.WidgetStdMod.HEADER,'<h1 id="moodle-dialogue-'+this.get("COUNT")+'-header-text">'+this.get(o)+"</h1>",e.WidgetStdMod.REPLACE),this.after("destroyedChange",function(){this.get(r).remove()},this),this._closeEvents.push(e.on("key",this.submit,window,"down:13",this),t.on("click",this.submit,this));var s=this.get("boundingBox").one(".closebutton");s&&this._closeEvents.push(s.on("click",this.submit,this))},submit:function(){(new e.EventHandle(this._closeEvents)).detach(),this.fire("complete"),this.hide(),this.destroy()}},{NAME:f,CSS_PREFIX:n,ATTRS:{title:{validator:e.Lang.isString,value:"Alert"},message:{validator:e.Lang.isString,value:"Confirm"},yesLabel:{validator:e.Lang.isString,setter:function(e){return e||(e="Ok"),e},value:"Ok"}}}),M.core.alert=l},"@VERSION@",{requires:["moodle-core-notification-dialogue"]});
YUI.add("moodle-core-notification-confirm",function(e,t){var n,r,i,s,o,u,a;n="moodle-dialogue",r="notificationBase",i="yesLabel",s="noLabel",o="title",u="question",a={BASE:"moodle-dialogue-base",WRAP:"moodle-dialogue-wrap",HEADER:"moodle-dialogue-hd",BODY:"moodle-dialogue-bd",CONTENT:"moodle-dialogue-content",FOOTER:"moodle-dialogue-ft",HIDDEN:"hidden",LIGHTBOX:"moodle-dialogue-lightbox"},M.core=M.core||{};var f="Moodle confirmation dialogue",l;l=function(e){l.superclass.constructor.apply(this,[e])},e.extend(l,M.core.dialogue,{_closeEvents:null,initializer:function(){this._closeEvents=[],this.publish("complete"),this.publish("complete-yes"),this.publish("complete-no");var t=e.Node.create('<input type="button" id="id_yuiconfirmyes-'+this.get("COUNT")+'" value="'+this.get(i)+'" />'),n=e.Node.create('<input type="button" id="id_yuiconfirmno-'+this.get("COUNT")+'" value="'+this.get(s)+'" />'),a=e.Node.create('<div class="confirmation-dialogue"></div>').append(e.Node.create('<div class="confirmation-message">'+this.get(u)+"</div>")).append(e.Node.create('<div class="confirmation-buttons"></div>').append(t).append(n));this.get(r).addClass("moodle-dialogue-confirm"),this.setStdModContent(e.WidgetStdMod.BODY,a,e.WidgetStdMod.REPLACE),this.setStdModContent(e.WidgetStdMod.HEADER,'<h1 id="moodle-dialogue-'+this.get("COUNT")+'-header-text">'+this.get(o)+"</h1>",e.WidgetStdMod.REPLACE),this.after("destroyedChange",function(){this.get(r).remove()},this),this._closeEvents.push(e.on("key",this.submit,window,"down:27",this,!1),t.on("click",this.submit,this,!0),n.on("click",this.submit,this,!1));var f=this.get("boundingBox").one(".closebutton");f&&this._closeEvents.push(f.on("click",this.submit,this))},submit:function(t,n){(new e.EventHandle(this._closeEvents)).detach(),this.fire("complete",n),n?this.fire("complete-yes"):this.fire("complete-no"),this.hide(),this.destroy()}},{NAME:f,CSS_PREFIX:n,ATTRS:{yesLabel:{validator:e.Lang.isString,value:"Yes"},noLabel:{validator:e.Lang.isString,value:"No"},title:{validator:e.Lang.isString,value:"Confirm"},question:{validator:e.Lang.isString,value:"Are you sure?"}}}),e.augment(l,e.EventTarget),M.core.confirm=l},"@VERSION@",{requires:["moodle-core-notification-dialogue"]});
YUI.add("moodle-core-notification-exception",function(e,t){var n,r,i,s,o,u,a;n="moodle-dialogue",r="notificationBase",i="yesLabel",s="noLabel",o="title",u="question",a={BASE:"moodle-dialogue-base",WRAP:"moodle-dialogue-wrap",HEADER:"moodle-dialogue-hd",BODY:"moodle-dialogue-bd",CONTENT:"moodle-dialogue-content",FOOTER:"moodle-dialogue-ft",HIDDEN:"hidden",LIGHTBOX:"moodle-dialogue-lightbox"},M.core=M.core||{};var f="Moodle exception",l;l=function(t){t.width=t.width||M.cfg.developerdebug?Math.floor(e.one(document.body).get("winWidth")/3)+"px":null,t.closeButton=!0,l.superclass.constructor.apply(this,[t])},e.extend(l,M.core.dialogue,{_hideTimeout:null,_keypress:null,initializer:function(t){var n,i=this,s=this.get("hideTimeoutDelay");this.get(r).addClass("moodle-dialogue-exception"),this.setStdModContent(e.WidgetStdMod.HEADER,'<h1 id="moodle-dialogue-'+t.COUNT+'-header-text">'+t.name+"</h1>",e.WidgetStdMod.REPLACE),n=e.Node.create('<div class="moodle-exception"></div>').append(e.Node.create('<div class="moodle-exception-message">'+this.get("message")+"</div>")).append(e.Node.create('<div class="moodle-exception-param hidden param-filename"><label>File:</label> '+this.get("fileName")+"</div>")).append(e.Node.create('<div class="moodle-exception-param hidden param-linenumber"><label>Line:</label> '+this.get("lineNumber")+"</div>")).append(e.Node.create('<div class="moodle-exception-param hidden param-stacktrace"><label>Stack trace:</label> <pre>'+this.get("stack")+"</pre></div>")),M.cfg.developerdebug&&n.all(".moodle-exception-param").removeClass("hidden"),this.setStdModContent(e.WidgetStdMod.BODY,n,e.WidgetStdMod.REPLACE),s&&(this._hideTimeout=setTimeout(function(){i.hide()},s)),this.after("visibleChange",this.visibilityChanged,this),this.after("destroyedChange",function(){this.get(r).remove()},this),this._keypress=e.on("key",this.hide,window,"down:13,27",this),this.centerDialogue()},visibilityChanged:function(e){if(e.attrName==="visible"&&e.prevVal&&!e.newVal){this._keypress&&this._keypress.detach();var t=this;setTimeout(function(){t.destroy()},1e3)}}},{NAME:f,CSS_PREFIX:n,ATTRS:{message:{value:""},name:{value:""},fileName:{value:""},lineNumber:{value:""},stack:{setter:function(e){var t=e.split("\n"),n=new RegExp("^(.+)@("+M.cfg.wwwroot+")?(.{0,75}).*:(\\d+)$"),r;for(r in t)t[r]=t[r].replace(n,"<div class='stacktrace-line'>ln: $4</div><div class='stacktrace-file'>$3</div><div class='stacktrace-call'>$1</div>");return t.join("")},value:""},hideTimeoutDelay:{validator:e.Lang.isNumber,value:null}}}),M.core.exception=l},"@VERSION@",{requires:["moodle-core-notification-dialogue"]});
YUI.add("moodle-core-notification-ajaxexception",function(e,t){var n,r,i,s,o,u,a;n="moodle-dialogue",r="notificationBase",i="yesLabel",s="noLabel",o="title",u="question",a={BASE:"moodle-dialogue-base",WRAP:"moodle-dialogue-wrap",HEADER:"moodle-dialogue-hd",BODY:"moodle-dialogue-bd",CONTENT:"moodle-dialogue-content",FOOTER:"moodle-dialogue-ft",HIDDEN:"hidden",LIGHTBOX:"moodle-dialogue-lightbox"},M.core=M.core||{};var f="Moodle AJAX exception",l;l=function(e){e.name=e.name||"Error",e.closeButton=!0,l.superclass.constructor.apply(this,[e])},e.extend(l,M.core.dialogue,{_keypress:null,initializer:function(t){var n,i=this,s=this.get("hideTimeoutDelay");this.get(r).addClass("moodle-dialogue-exception"),this.setStdModContent(e.WidgetStdMod.HEADER,'<h1 id="moodle-dialogue-'+this.get("COUNT")+'-header-text">'+t.name+"</h1>",e.WidgetStdMod.REPLACE),n=e.Node.create('<div class="moodle-ajaxexception"></div>').append(e.Node.create('<div class="moodle-exception-message">'+this.get("error")+"</div>")).append(e.Node.create('<div class="moodle-exception-param hidden param-debuginfo"><label>URL:</label> '+this.get("reproductionlink")+"</div>")).append(e.Node.create('<div class="moodle-exception-param hidden param-debuginfo"><label>Debug info:</label> '+this.get("debuginfo")+"</div>")).append(e.Node.create('<div class="moodle-exception-param hidden param-stacktrace"><label>Stack trace:</label> <pre>'+this.get("stacktrace")+"</pre></div>")),M.cfg.developerdebug&&n.all(".moodle-exception-param").removeClass("hidden"),this.setStdModContent(e.WidgetStdMod.BODY,n,e.WidgetStdMod.REPLACE),s&&(this._hideTimeout=setTimeout(function(){i.hide()},s)),this.after("visibleChange",this.visibilityChanged,this),this._keypress=e.on("key",this.hide,window,"down:13, 27",this),this.centerDialogue()},visibilityChanged:function(e){if(e.attrName==="visible"&&e.prevVal&&!e.newVal){var t=this;this._keypress.detach(),setTimeout(function(){t.destroy()},1e3)}}},{NAME:f,CSS_PREFIX:n,ATTRS:{error:{validator:e.Lang.isString,value:"Unknown error"},debuginfo:{value:null},stacktrace:{value:null},reproductionlink:{setter:function(e){return e!==null&&(e='<a href="'+e+'">'+e.replace(M.cfg.wwwroot,"")+"</a>"),e},value:null},hideTimeoutDelay:{validator:e.Lang.isNumber,value:null}}}),M.core.ajaxException=l},"@VERSION@",{requires:["moodle-core-notification-dialogue"]});
YUI.add("moodle-core-notification",function(e,t){},"@VERSION@",{requires:["moodle-core-notification-dialogue","moodle-core-notification-alert","moodle-core-notification-confirm","moodle-core-notification-exception","moodle-core-notification-ajaxexception"]});
/*
YUI 3.13.0 (build 508226d)
Copyright 2013 Yahoo! Inc. All rights reserved.
Licensed under the BSD License.
http://yuilibrary.com/license/
*/

YUI.add("cache-base",function(e,t){var n=e.Lang,r=e.Lang.isDate,i=function(){i.superclass.constructor.apply(this,arguments)};e.mix(i,{NAME:"cache",ATTRS:{max:{value:0,setter:"_setMax"},size:{readOnly:!0,getter:"_getSize"},uniqueKeys:{value:!1},expires:{value:0,validator:function(t){return e.Lang.isDate(t)||e.Lang.isNumber(t)&&t>=0}},entries:{readOnly:!0,getter:"_getEntries"}}}),e.extend(i,e.Base,{_entries:null,initializer:function(e){this.publish("add",{defaultFn:this._defAddFn}),this.publish("flush",{defaultFn:this._defFlushFn}),this._entries=[]},destructor:function(){this._entries=[]},_setMax:function(e){var t=this._entries;if(e>0){if(t)while(t.length>e)t.shift()}else e=0,this._entries=[];return e},_getSize:function(){return this._entries.length},_getEntries:function(){return this._entries},_defAddFn:function(e){var t=this._entries,r=e.entry,i=this.get("max"),s;this.get("uniqueKeys")&&(s=this._position(e.entry.request),n.isValue(s)&&t.splice(s,1));while(i&&t.length>=i)t.shift();t[t.length]=r},_defFlushFn:function(e){var t=this._entries,r=e.details[0],i;r&&n.isValue(r.request)?(i=this._position(r.request),n.isValue(i)&&t.splice(i,1)):this._entries=[]},_isMatch:function(e,t){return!t.expires||new Date<t.expires?e===t.request:!1},_position:function(e){var t=this._entries,n=t.length,r=n-1;if(this.get("max")===null||this.get("max")>0)for(;r>=0;r--)if(this._isMatch(e,t[r]))return r;return null},add:function(e,t){var i=this.get("expires");this.get("initialized")&&(this.get("max")===null||this.get("max")>0)&&(n.isValue(e)||n.isNull(e)||n.isUndefined(e))&&this.fire("add",{entry:{request:e,response:t,cached:new Date,expires:r(i)?i:i?new Date((new Date).getTime()+this.get("expires")):null}})},flush:function(e){this.fire("flush",{request:n.isValue(e)?e:null})},retrieve:function(e){var t=this._entries,r=t.length,i=null,s;if(r>0&&(this.get("max")===null||this.get("max")>0)){this.fire("request",{request:e}),s=this._position(e);if(n.isValue(s))return i=t[s],this.fire("retrieve",{entry:i}),s<r-1&&(t.splice(s,1),t[t.length]=i),i}return null}}),e.Cache=i},"3.13.0",{requires:["base"]});
YUI.add("moodle-core-popuphelp",function(e,t){function n(){n.superclass.constructor.apply(this,arguments)}var r={CLICKABLELINKS:"span.helptooltip > a",FOOTER:"div.moodle-dialogue-ft"},i={ICON:"icon",ICONPRE:"icon-pre"},s={};n.NAME="moodle-core-popuphelp",n.ATTRS=s,e.extend(n,e.Base,{panel:null,initializer:function(){e.one("body").delegate("click",this.display_panel,r.CLICKABLELINKS,this)},display_panel:function(e){this.panel||(this.panel=new M.core.tooltip({bodyhandler:this.set_body_content,footerhandler:this.set_footer,initialheadertext:M.util.get_string("loadinghelp","moodle"),initialfootertext:""})),this.panel.display_panel(e)},set_footer:function(t){t.doclink?(doclink=e.Node.create("<a />").setAttrs({href:t.doclink.link}).addClass(t.doclink["class"]),helpicon=e.Node.create("<img />").setAttrs({src:M.util.image_url("docs","core")}).addClass(i.ICON).addClass(i.ICONPRE),doclink.appendChild(helpicon),doclink.appendChild(t.doclink.linktext),this.set("footerContent",doclink),this.bb.one(r.FOOTER).show()):this.bb.one(r.FOOTER).hide()}}),M.core=M.core||{},M.core.popuphelp=M.core.popuphelp||null,M.core.init_popuphelp=M.core.init_popuphelp||function(e){return M.core.popuphelp||(M.core.popuphelp=new n(e)),M.core.popuphelp}},"@VERSION@",{requires:["moodle-core-tooltip"]});
