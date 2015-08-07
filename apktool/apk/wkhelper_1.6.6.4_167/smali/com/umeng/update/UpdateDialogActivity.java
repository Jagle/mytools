package com.umeng.update; class UpdateDialogActivity { void a() { int a;
a=0;// .class public Lcom/umeng/update/UpdateDialogActivity;
a=0;// .super Landroid/app/Activity;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:I
a=0;// 
a=0;// .field b:Lcom/umeng/update/p;
a=0;// 
a=0;// .field c:Z
a=0;// 
a=0;// .field d:Ljava/io/File;
a=0;// 
a=0;// .field e:Landroid/view/ViewGroup;
a=0;// 
a=0;// .field f:Lcom/alimama/mobile/a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/umeng/update/UpdateDialogActivity;);
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/umeng/update/UpdateDialogActivity;->a:I
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/umeng/update/UpdateDialogActivity;->c:Z
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/update/UpdateDialogActivity;->d:Ljava/io/File;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 14
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/umeng/update/UpdateDialogActivity;->requestWindowFeature(I)Z
a=0;// 
a=0;//     invoke-static {p0}, La/b/c;->a(Landroid/content/Context;)La/b/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,La/b/c;);
a=0;//     const-string v1, "umeng_update_dialog"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, La/b/c;->c(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/umeng/update/UpdateDialogActivity;->setContentView(I)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/umeng/update/UpdateDialogActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "response"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/umeng/update/p;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/update/UpdateDialogActivity;->b:Lcom/umeng/update/p;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/umeng/update/UpdateDialogActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "file"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Lcom/umeng/update/UpdateDialogActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "force"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     iput-object v0, p0, Lcom/umeng/update/UpdateDialogActivity;->d:Ljava/io/File;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {p0}, La/b/c;->a(Landroid/content/Context;)La/b/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,La/b/c;);
a=0;//     const-string v2, "umeng_update_content"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, La/b/c;->a(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p0}, La/b/c;->a(Landroid/content/Context;)La/b/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "umeng_update_wifi_indicator"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, La/b/c;->a(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {p0}, La/b/c;->a(Landroid/content/Context;)La/b/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, "umeng_update_id_ok"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, La/b/c;->a(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {p0}, La/b/c;->a(Landroid/content/Context;)La/b/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v6, "umeng_update_id_cancel"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v6}, La/b/c;->a(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {p0}, La/b/c;->a(Landroid/content/Context;)La/b/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v7, "umeng_update_id_ignore"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v7}, La/b/c;->a(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {p0}, La/b/c;->a(Landroid/content/Context;)La/b/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v8, "umeng_update_id_close"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v8}, La/b/c;->a(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {p0}, La/b/c;->a(Landroid/content/Context;)La/b/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v9, "umeng_update_id_check"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v9}, La/b/c;->a(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-static {p0}, La/b/c;->a(Landroid/content/Context;)La/b/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v10, "umeng_update_frame"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v10}, La/b/c;->a(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/umeng/update/UpdateDialogActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/update/UpdateDialogActivity;->e:Landroid/view/ViewGroup;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/UpdateDialogActivity;->e:Landroid/view/ViewGroup;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/UpdateDialogActivity;->b:Lcom/umeng/update/p;
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/umeng/update/p;->k:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/m;->n()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-nez v10, :cond_5
a=0;// 
a=0;//     new-instance v10, Lcom/alimama/mobile/a;
a=0;// 
a=0;//     #v10=(UninitRef,Lcom/alimama/mobile/a;);
a=0;//     invoke-direct {v10, p0}, Lcom/alimama/mobile/a;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v10=(Reference,Lcom/alimama/mobile/a;);
a=0;//     iput-object v10, p0, Lcom/umeng/update/UpdateDialogActivity;->f:Lcom/alimama/mobile/a;
a=0;// 
a=0;//     iget-object v10, p0, Lcom/umeng/update/UpdateDialogActivity;->f:Lcom/alimama/mobile/a;
a=0;// 
a=0;//     invoke-virtual {v10, v0}, Lcom/alimama/mobile/a;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/UpdateDialogActivity;->e:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup;);
a=0;//     iget-object v10, p0, Lcom/umeng/update/UpdateDialogActivity;->f:Lcom/alimama/mobile/a;
a=0;// 
a=0;//     new-instance v11, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v11=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v12, -0x1
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     const/4 v13, -0x2
a=0;// 
a=0;//     #v13=(Byte);
a=0;//     invoke-direct {v11, v12, v13}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v11=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {v0, v10, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     new-instance v10, Lcom/umeng/update/n;
a=0;// 
a=0;//     #v10=(UninitRef,Lcom/umeng/update/n;);
a=0;//     invoke-direct {v10, p0, v5, v7}, Lcom/umeng/update/n;-><init>(Lcom/umeng/update/UpdateDialogActivity;II)V
a=0;// 
a=0;//     #v10=(Reference,Lcom/umeng/update/n;);
a=0;//     new-instance v11, Lcom/umeng/update/o;
a=0;// 
a=0;//     #v11=(UninitRef,Lcom/umeng/update/o;);
a=0;//     invoke-direct {v11, p0}, Lcom/umeng/update/o;-><init>(Lcom/umeng/update/UpdateDialogActivity;)V
a=0;// 
a=0;//     #v11=(Reference,Lcom/umeng/update/o;);
a=0;//     if-lez v4, :cond_2
a=0;// 
a=0;//     invoke-static {p0}, La/b/a;->c(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v4}, Lcom/umeng/update/UpdateDialogActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     invoke-virtual {p0, v9}, Lcom/umeng/update/UpdateDialogActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0, v5}, Lcom/umeng/update/UpdateDialogActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     invoke-virtual {p0, v6}, Lcom/umeng/update/UpdateDialogActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     invoke-virtual {p0, v7}, Lcom/umeng/update/UpdateDialogActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     invoke-virtual {p0, v8}, Lcom/umeng/update/UpdateDialogActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     invoke-virtual {p0, v9}, Lcom/umeng/update/UpdateDialogActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/CheckBox;
a=0;// 
a=0;//     invoke-virtual {v0, v11}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/UpdateDialogActivity;->b:Lcom/umeng/update/p;
a=0;// 
a=0;//     invoke-virtual {v0, p0, v1}, Lcom/umeng/update/p;->a(Landroid/content/Context;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lcom/umeng/update/UpdateDialogActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/TextView;->requestFocus()Z
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(Reference,Ljava/lang/String;);v3=(Boolean);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Boolean);v2=(Integer);v4=(Integer);v5=(Integer);v6=(Integer);v7=(Integer);v8=(Integer);v9=(Integer);v10=(Boolean);
a=0;//     const-string v0, "update"
a=0;// 
a=0;//     const-string v10, "\u5c1a\u672a\u8bbe\u7f6e\u63a8\u5e7f\u4f4did,\u65e0\u6cd5\u5c55\u793a\u63a8\u5e7f\u5185\u5bb9\u3002"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v10}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v11=(Reference,Lcom/umeng/update/o;);v12=(Conflicted);v13=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     iget v0, p0, Lcom/umeng/update/UpdateDialogActivity;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/umeng/update/UpdateDialogActivity;->b:Lcom/umeng/update/p;
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/update/p;);
a=0;//     iget-object v2, p0, Lcom/umeng/update/UpdateDialogActivity;->d:Ljava/io/File;
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v0, p0, v1, v2}, Lcom/umeng/update/c;->a(ILandroid/content/Context;Lcom/umeng/update/p;Ljava/io/File;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/UpdateDialogActivity;->f:Lcom/alimama/mobile/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/a;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/UpdateDialogActivity;->f:Lcom/alimama/mobile/a;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/alimama/mobile/a;->a()V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
