package android.support.v4.app; class e { void a() { int a;
a=0;// .class final Landroid/support/v4/app/e;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/ViewTreeObserver$OnPreDrawListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Landroid/view/View;
a=0;// 
a=0;// .field final synthetic b:Ljava/lang/Object;
a=0;// 
a=0;// .field final synthetic c:Ljava/util/ArrayList;
a=0;// 
a=0;// .field final synthetic d:Landroid/support/v4/app/h;
a=0;// 
a=0;// .field final synthetic e:Z
a=0;// 
a=0;// .field final synthetic f:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;// .field final synthetic g:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;// .field final synthetic h:Landroid/support/v4/app/c;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/app/c;Landroid/view/View;Ljava/lang/Object;Ljava/util/ArrayList;Landroid/support/v4/app/h;ZLandroid/support/v4/app/Fragment;Landroid/support/v4/app/Fragment;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Landroid/support/v4/app/e;->h:Landroid/support/v4/app/c;
a=0;// 
a=0;//     iput-object p2, p0, Landroid/support/v4/app/e;->a:Landroid/view/View;
a=0;// 
a=0;//     iput-object p3, p0, Landroid/support/v4/app/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     iput-object p4, p0, Landroid/support/v4/app/e;->c:Ljava/util/ArrayList;
a=0;// 
a=0;//     iput-object p5, p0, Landroid/support/v4/app/e;->d:Landroid/support/v4/app/h;
a=0;// 
a=0;//     iput-boolean p6, p0, Landroid/support/v4/app/e;->e:Z
a=0;// 
a=0;//     iput-object p7, p0, Landroid/support/v4/app/e;->f:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iput-object p8, p0, Landroid/support/v4/app/e;->g:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/e;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final onPreDraw()Z
a=0;//     .locals 4
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/e;->a:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/e;->c:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/app/z;->a(Ljava/lang/Object;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/e;->c:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/e;->h:Landroid/support/v4/app/c;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/e;->d:Landroid/support/v4/app/h;
a=0;// 
a=0;//     iget-boolean v2, p0, Landroid/support/v4/app/e;->e:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/e;->f:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     invoke-static {v0, v1, v2, v3}, Landroid/support/v4/app/c;->a(Landroid/support/v4/app/c;Landroid/support/v4/app/h;ZLandroid/support/v4/app/Fragment;)Landroid/support/v4/c/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/c/a;->isEmpty()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/e;->c:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/e;->d:Landroid/support/v4/app/h;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/h;);
a=0;//     iget-object v2, v2, Landroid/support/v4/app/h;->d:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :goto_0
a=0;//     iget-object v1, p0, Landroid/support/v4/app/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/app/e;->c:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/support/v4/app/z;->b(Ljava/lang/Object;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/e;->h:Landroid/support/v4/app/c;
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/app/e;->d:Landroid/support/v4/app/h;
a=0;// 
a=0;//     invoke-static {v1, v0, v2}, Landroid/support/v4/app/c;->a(Landroid/support/v4/app/c;Landroid/support/v4/c/a;Landroid/support/v4/app/h;)V
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/e;->f:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/app/e;->g:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-boolean v3, p0, Landroid/support/v4/app/e;->e:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {v1, v2, v3, v0}, Landroid/support/v4/app/c;->a(Landroid/support/v4/app/Fragment;Landroid/support/v4/app/Fragment;ZLandroid/support/v4/c/a;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/support/v4/c/a;);v1=(Boolean);v2=(Boolean);v3=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/e;->c:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/c/a;->values()Ljava/util/Collection;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Collection;);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
