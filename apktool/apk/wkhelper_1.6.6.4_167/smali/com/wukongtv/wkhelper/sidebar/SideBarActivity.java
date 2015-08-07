package com.wukongtv.wkhelper.sidebar; class SideBarActivity { void a() { int a;
a=0;// .class public Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;
a=0;// .super Landroid/app/Activity;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private b:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private c:Ljava/lang/String;
a=0;// 
a=0;// .field private d:Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->c:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/sidebar/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/sidebar/a;);
a=0;//     invoke-direct {v0, p0}, Lcom/wukongtv/wkhelper/sidebar/a;-><init>(Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/sidebar/a;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->d:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->finish()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onBackPressed()V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "SIDEBAR_BUTTON_CLICK"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "BackPressed"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0, v1}, Lcom/umeng/a/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     const v0, 0x7f030015
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->setContentView(I)V
a=0;// 
a=0;//     const v0, 0x7f0b0059
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     const v1, 0x7f0b0058
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/Button;
a=0;// 
a=0;//     const v2, 0x7f0b0056
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->a:Landroid/widget/ImageView;
a=0;// 
a=0;//     const v2, 0x7f0b0057
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->b:Landroid/widget/ImageView;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->d:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->d:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     invoke-static {p0}, Lcom/umeng/a/f;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     invoke-static {p0}, Lcom/umeng/a/f;->b(Landroid/content/Context;)V
a=0;// 
a=0;//     const-string v0, "SIDEBAR_POPUP"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0, v1}, Lcom/umeng/a/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "SIDE_BAR_POPUP"
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/umeng/a/f;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "off"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->finish()V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onStart()V
a=0;//     .locals 6
a=0;// 
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onStart()V
a=0;// 
a=0;//     const-string v0, "mySharedPreferences"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/sidebar/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/sidebar/e;);
a=0;//     invoke-direct {v1, v0}, Lcom/wukongtv/wkhelper/sidebar/e;-><init>(Landroid/content/SharedPreferences;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/sidebar/e;);
a=0;//     iget-wide v2, v1, Lcom/wukongtv/wkhelper/sidebar/e;->d:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Calendar;);
a=0;//     invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static {v2, v3, v4, v5}, Lcom/wukongtv/wkhelper/sidebar/f;->a(JJ)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     iget v4, v1, Lcom/wukongtv/wkhelper/sidebar/e;->i:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-long v4, v4
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     cmp-long v4, v2, v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-lez v4, :cond_1
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "x="
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v3, v1, Lcom/wukongtv/wkhelper/sidebar/e;->i:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->c:Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "popup_sidebar_time"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Calendar;);
a=0;//     invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     invoke-interface {v0, v2, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
a=0;// 
a=0;//     iget-boolean v0, v1, Lcom/wukongtv/wkhelper/sidebar/e;->b:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     iget-boolean v0, v1, Lcom/wukongtv/wkhelper/sidebar/e;->a:Z
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-static {}, Lcom/c/a/b/f;->a()Lcom/c/a/b/f;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/b/f;);
a=0;//     iget-object v2, v1, Lcom/wukongtv/wkhelper/sidebar/e;->e:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->a:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Lcom/c/a/b/f;->a(Ljava/lang/String;Landroid/widget/ImageView;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/c/a/b/f;->a()Lcom/c/a/b/f;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, v1, Lcom/wukongtv/wkhelper/sidebar/e;->f:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->b:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/c/a/b/f;->a(Ljava/lang/String;Landroid/widget/ImageView;)V
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);v2=(LongLo);v3=(LongHi);v4=(Byte);
a=0;//     iget v4, v1, Lcom/wukongtv/wkhelper/sidebar/e;->j:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-long v4, v4
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     cmp-long v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "y="
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v3, v1, Lcom/wukongtv/wkhelper/sidebar/e;->j:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->c:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v3=(Reference,Ljava/util/Calendar;);
a=0;//     invoke-static {}, Lcom/c/a/b/f;->a()Lcom/c/a/b/f;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/b/f;);
a=0;//     iget-object v2, v1, Lcom/wukongtv/wkhelper/sidebar/e;->g:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->a:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Lcom/c/a/b/f;->a(Ljava/lang/String;Landroid/widget/ImageView;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/c/a/b/f;->a()Lcom/c/a/b/f;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, v1, Lcom/wukongtv/wkhelper/sidebar/e;->h:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->b:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/c/a/b/f;->a(Ljava/lang/String;Landroid/widget/ImageView;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/sidebar/SideBarActivity;->finish()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
