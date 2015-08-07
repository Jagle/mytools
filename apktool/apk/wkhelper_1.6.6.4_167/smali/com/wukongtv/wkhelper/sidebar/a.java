package com.wukongtv.wkhelper.sidebar; class a { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/sidebar/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/sidebar/a;->a:Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/sidebar/a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final onClick(Landroid/view/View;)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/sidebar/a;->a:Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->a(Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/sidebar/a;->a:Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;
a=0;// 
a=0;//     const-string v1, "SIDEBAR_BUTTON_CLICK"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "Cancel"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/umeng/a/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/sidebar/a;->a:Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;);
a=0;//     const-string v1, "mySharedPreferences"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "is_no_longer_remind"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/sidebar/a;->a:Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->finish()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/sidebar/a;->a:Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;
a=0;// 
a=0;//     const-string v1, "SIDEBAR_BUTTON_CLICK"
a=0;// 
a=0;//     const-string v2, "Don\'t remind"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/umeng/a/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x7f0b0058
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
}}
