package com.wukongtv.wkhelper.ime; class j { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/ime/j;
a=0;// .super Landroid/content/BroadcastReceiver;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/wukongtv/wkhelper/ime/PinyinIME;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/wukongtv/wkhelper/ime/PinyinIME;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/ime/j;->a:Lcom/wukongtv/wkhelper/ime/PinyinIME;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/ime/j;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
a=0;//     .locals 18
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "InlinedApi"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     :try_start_0
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/j;);
a=0;//     iget-object v2, v0, Lcom/wukongtv/wkhelper/ime/j;->a:Lcom/wukongtv/wkhelper/ime/PinyinIME;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/ime/PinyinIME;);
a=0;//     invoke-virtual {v2}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->getCurrentInputConnection()Landroid/view/inputmethod/InputConnection;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "com.wukongtv.ime.key_event"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     const-string v3, "keycode"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v3, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/wukongtv/wkhelper/ime/j;->a:Lcom/wukongtv/wkhelper/ime/PinyinIME;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->a(Lcom/wukongtv/wkhelper/ime/PinyinIME;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-eq v9, v3, :cond_1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/wukongtv/wkhelper/ime/j;->a:Lcom/wukongtv/wkhelper/ime/PinyinIME;
a=0;// 
a=0;//     invoke-virtual {v2, v9}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->a(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v3=(PosByte);v4=(LongLo);v5=(LongHi);v6=(Null);v7=(Uninit);v8=(Uninit);v9=(Integer);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v16=(Uninit);v17=(Uninit);
a=0;//     new-instance v3, Landroid/view/KeyEvent;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/view/KeyEvent;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     const/16 v14, 0xa
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     move-wide v6, v4
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-direct/range {v3 .. v14}, Landroid/view/KeyEvent;-><init>(JJIIIIIII)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/KeyEvent;);
a=0;//     invoke-interface {v2, v3}, Landroid/view/inputmethod/InputConnection;->sendKeyEvent(Landroid/view/KeyEvent;)Z
a=0;// 
a=0;//     new-instance v3, Landroid/view/KeyEvent;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/view/KeyEvent;);
a=0;//     const-wide/16 v6, 0x64
a=0;// 
a=0;//     add-long v16, v4, v6
a=0;// 
a=0;//     #v16=(LongLo);v17=(LongHi);
a=0;//     const-wide/16 v6, 0x64
a=0;// 
a=0;//     add-long/2addr v6, v4
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     const/16 v14, 0xa
a=0;// 
a=0;//     move-wide/from16 v4, v16
a=0;// 
a=0;//     invoke-direct/range {v3 .. v14}, Landroid/view/KeyEvent;-><init>(JJIIIIIII)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/KeyEvent;);
a=0;//     invoke-interface {v2, v3}, Landroid/view/inputmethod/InputConnection;->sendKeyEvent(Landroid/view/KeyEvent;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
