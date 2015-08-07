package com.lovesport.update; class UpdateActivity { void a() { int a;
a=0;// .class public Lcom/lovesport/update/UpdateActivity;
a=0;// .super Landroid/app/Activity;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:Landroid/widget/ProgressBar;
a=0;// 
a=0;// .field public b:Landroid/widget/TextView;
a=0;// 
a=0;// .field public c:Landroid/widget/TextView;
a=0;// 
a=0;// .field public d:Lcom/umeng/update/p;
a=0;// 
a=0;// .field public e:Landroid/widget/TextView;
a=0;// 
a=0;// .field private f:Lcom/umeng/update/b;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lovesport/update/UpdateActivity;);
a=0;//     new-instance v0, Lcom/lovesport/update/j;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/update/j;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/update/j;-><init>(Lcom/lovesport/update/UpdateActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/update/j;);
a=0;//     iput-object v0, p0, Lcom/lovesport/update/UpdateActivity;->f:Lcom/umeng/update/b;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/update/UpdateActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "UpdateResponse"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/umeng/update/p;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/lovesport/update/UpdateActivity;->d:Lcom/umeng/update/p;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/update/UpdateActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "isProgressShow"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     sget v0, Lcom/lovesport/update/e;->update_dialog:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/lovesport/update/UpdateActivity;->setContentView(I)V
a=0;// 
a=0;//     sget v0, Lcom/lovesport/update/d;->umeng_update_id_ok:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/lovesport/update/UpdateActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/lovesport/update/UpdateActivity;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     sget v0, Lcom/lovesport/update/d;->umeng_update_id_cancel:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/lovesport/update/UpdateActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/lovesport/update/UpdateActivity;->c:Landroid/widget/TextView;
a=0;// 
a=0;//     sget v0, Lcom/lovesport/update/d;->umeng_update_content:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/lovesport/update/UpdateActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/lovesport/update/UpdateActivity;->e:Landroid/widget/TextView;
a=0;// 
a=0;//     sget v0, Lcom/lovesport/update/d;->line:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/lovesport/update/UpdateActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v2, Lcom/lovesport/update/g;->f:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/update/UpdateActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/lovesport/update/b;->line:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundColor(I)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     sget-object v0, Lcom/lovesport/update/g;->c:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/update/UpdateActivity;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     sget-object v2, Lcom/lovesport/update/g;->c:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/update/UpdateActivity;->c:Landroid/widget/TextView;
a=0;// 
a=0;//     sget-object v2, Lcom/lovesport/update/g;->c:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     :goto_1
a=0;//     iget-object v0, p0, Lcom/lovesport/update/UpdateActivity;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v2, Lcom/lovesport/update/k;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/lovesport/update/k;);
a=0;//     invoke-direct {v2, p0}, Lcom/lovesport/update/k;-><init>(Lcom/lovesport/update/UpdateActivity;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/lovesport/update/k;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/update/UpdateActivity;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v2, Lcom/lovesport/update/l;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/lovesport/update/l;);
a=0;//     invoke-direct {v2, p0}, Lcom/lovesport/update/l;-><init>(Lcom/lovesport/update/UpdateActivity;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/lovesport/update/l;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/update/UpdateActivity;->c:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v2, Lcom/lovesport/update/m;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/lovesport/update/m;);
a=0;//     invoke-direct {v2, p0}, Lcom/lovesport/update/m;-><init>(Lcom/lovesport/update/UpdateActivity;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/lovesport/update/m;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/update/UpdateActivity;->c:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v2, Lcom/lovesport/update/n;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/lovesport/update/n;);
a=0;//     invoke-direct {v2, p0}, Lcom/lovesport/update/n;-><init>(Lcom/lovesport/update/UpdateActivity;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/lovesport/update/n;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     sget v0, Lcom/lovesport/update/d;->update_title:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/lovesport/update/UpdateActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     sget v2, Lcom/lovesport/update/g;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     sget v2, Lcom/lovesport/update/g;->b:I
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     :goto_2
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget v3, Lcom/lovesport/update/f;->new_version:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Lcom/lovesport/update/UpdateActivity;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/lovesport/update/UpdateActivity;->d:Lcom/umeng/update/p;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/umeng/update/p;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget v3, Lcom/lovesport/update/f;->update_liangdian:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Lcom/lovesport/update/UpdateActivity;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/update/UpdateActivity;->e:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/lovesport/update/UpdateActivity;->d:Lcom/umeng/update/p;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/umeng/update/p;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     sget v0, Lcom/lovesport/update/g;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/update/UpdateActivity;->e:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     sget v2, Lcom/lovesport/update/g;->e:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     :goto_3
a=0;//     #v3=(Conflicted);
a=0;//     sget v0, Lcom/lovesport/update/d;->progress_bar:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/lovesport/update/UpdateActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/lovesport/update/UpdateActivity;->a:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     sget-object v0, Lcom/lovesport/update/g;->d:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/update/UpdateActivity;->a:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     sget-object v2, Lcom/lovesport/update/g;->d:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     :goto_4
a=0;//     iget-object v0, p0, Lcom/lovesport/update/UpdateActivity;->a:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/update/UpdateActivity;->f:Lcom/umeng/update/b;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/c;->a(Lcom/umeng/update/b;)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Integer);v3=(Uninit);
a=0;//     sget v2, Lcom/lovesport/update/g;->f:I
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundColor(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/lovesport/update/UpdateActivity;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/update/UpdateActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/lovesport/update/c;->update_button_selector:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/update/UpdateActivity;->c:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/update/UpdateActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget v3, Lcom/lovesport/update/c;->update_button_selector:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/lovesport/update/UpdateActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/lovesport/update/b;->titleColor:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/lovesport/update/UpdateActivity;->e:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {p0}, Lcom/lovesport/update/UpdateActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget v3, Lcom/lovesport/update/b;->contentTextColor:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_5
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/lovesport/update/UpdateActivity;->a:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/update/UpdateActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/lovesport/update/c;->progressbar:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     goto :goto_4
a=0;// .end method
}}
