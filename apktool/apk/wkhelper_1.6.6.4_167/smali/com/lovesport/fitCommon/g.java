package com.lovesport.fitCommon; class g { void a() { int a;
a=0;// .class public final Lcom/lovesport/fitCommon/g;
a=0;// .super Landroid/content/BroadcastReceiver;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/lovesport/fitCommon/a;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/lovesport/fitCommon/g;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lovesport/fitCommon/g;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "android.intent.action.SCREEN_OFF"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, "mandy"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "ACTION_SCREEN_OFF"
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/g;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/lovesport/fitCommon/a;->a:Lcom/lovesport/fitCommon/WukongVideoView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/lovesport/fitCommon/WukongVideoView;->b()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/g;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/lovesport/fitCommon/a;->finish()V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Lcom/lovesport/fitCommon/n;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/g;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/a;);
a=0;//     invoke-static {v0}, Lcom/lovesport/fitCommon/a;->i(Lcom/lovesport/fitCommon/a;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/g;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/a;);
a=0;//     invoke-virtual {v0}, Lcom/lovesport/fitCommon/a;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/lovesport/fitCommon/l;->player_network:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/g;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/lovesport/fitCommon/a;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
