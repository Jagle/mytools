package com.lovesport.fitCommon; class h { void a() { int a;
a=0;// .class final Lcom/lovesport/fitCommon/h;
a=0;// .super Landroid/os/AsyncTask;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/lovesport/fitCommon/a;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/lovesport/fitCommon/h;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lovesport/fitCommon/h;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;// 
a=0;//     check-cast p1, [Ljava/lang/String;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     aget-object v0, p1, v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/h;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lovesport/fitCommon/a;);
a=0;//     invoke-static {v1}, Lcom/lovesport/fitCommon/n;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/lovesport/fitCommon/n;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected final synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 3
a=0;// 
a=0;//     check-cast p1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/h;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/a;);
a=0;//     invoke-static {v0}, Lcom/lovesport/fitCommon/a;->l(Lcom/lovesport/fitCommon/a;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/h;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/a;);
a=0;//     invoke-virtual {v0, p1}, Lcom/lovesport/fitCommon/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/h;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/lovesport/fitCommon/a;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/h;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lovesport/fitCommon/a;);
a=0;//     invoke-virtual {v1}, Lcom/lovesport/fitCommon/a;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/lovesport/fitCommon/l;->player_settings_disclaimer_tengxun:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
