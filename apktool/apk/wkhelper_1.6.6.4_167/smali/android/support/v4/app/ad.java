package android.support.v4.app; class ad { void a() { int a;
a=0;// .class final Landroid/support/v4/app/ad;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/ViewTreeObserver$OnPreDrawListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Landroid/view/View;
a=0;// 
a=0;// .field final synthetic b:Landroid/transition/Transition;
a=0;// 
a=0;// .field final synthetic c:Landroid/view/View;
a=0;// 
a=0;// .field final synthetic d:Ljava/util/ArrayList;
a=0;// 
a=0;// .field final synthetic e:Landroid/transition/Transition;
a=0;// 
a=0;// .field final synthetic f:Ljava/util/ArrayList;
a=0;// 
a=0;// .field final synthetic g:Landroid/transition/Transition;
a=0;// 
a=0;// .field final synthetic h:Ljava/util/ArrayList;
a=0;// 
a=0;// .field final synthetic i:Ljava/util/Map;
a=0;// 
a=0;// .field final synthetic j:Ljava/util/ArrayList;
a=0;// 
a=0;// .field final synthetic k:Landroid/transition/Transition;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/view/View;Landroid/transition/Transition;Landroid/view/View;Ljava/util/ArrayList;Landroid/transition/Transition;Ljava/util/ArrayList;Landroid/transition/Transition;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/ArrayList;Landroid/transition/Transition;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Landroid/support/v4/app/ad;->a:Landroid/view/View;
a=0;// 
a=0;//     iput-object p2, p0, Landroid/support/v4/app/ad;->b:Landroid/transition/Transition;
a=0;// 
a=0;//     iput-object p3, p0, Landroid/support/v4/app/ad;->c:Landroid/view/View;
a=0;// 
a=0;//     iput-object p4, p0, Landroid/support/v4/app/ad;->d:Ljava/util/ArrayList;
a=0;// 
a=0;//     iput-object p5, p0, Landroid/support/v4/app/ad;->e:Landroid/transition/Transition;
a=0;// 
a=0;//     iput-object p6, p0, Landroid/support/v4/app/ad;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     iput-object p7, p0, Landroid/support/v4/app/ad;->g:Landroid/transition/Transition;
a=0;// 
a=0;//     iput-object p8, p0, Landroid/support/v4/app/ad;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     iput-object p9, p0, Landroid/support/v4/app/ad;->i:Ljava/util/Map;
a=0;// 
a=0;//     iput-object p10, p0, Landroid/support/v4/app/ad;->j:Ljava/util/ArrayList;
a=0;// 
a=0;//     iput-object p11, p0, Landroid/support/v4/app/ad;->k:Landroid/transition/Transition;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/ad;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final onPreDraw()Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ad;->a:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ad;->b:Landroid/transition/Transition;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ad;->b:Landroid/transition/Transition;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/ad;->c:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1}, Landroid/transition/Transition;->removeTarget(Landroid/view/View;)Landroid/transition/Transition;
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ad;->b:Landroid/transition/Transition;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/ad;->d:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/app/z;->a(Ljava/lang/Object;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ad;->e:Landroid/transition/Transition;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ad;->e:Landroid/transition/Transition;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/ad;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/app/z;->a(Ljava/lang/Object;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ad;->g:Landroid/transition/Transition;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ad;->g:Landroid/transition/Transition;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/ad;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/app/z;->a(Ljava/lang/Object;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ad;->i:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/view/View;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ad;->j:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Integer);v4=(Conflicted);
a=0;//     if-ge v1, v3, :cond_4
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/app/ad;->k:Landroid/transition/Transition;
a=0;// 
a=0;//     #v4=(Reference,Landroid/transition/Transition;);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ad;->j:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v4, v0, v2}, Landroid/transition/Transition;->excludeTarget(Landroid/view/View;Z)Landroid/transition/Transition;
a=0;// 
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ad;->k:Landroid/transition/Transition;
a=0;// 
a=0;//     #v0=(Reference,Landroid/transition/Transition;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/ad;->c:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/transition/Transition;->excludeTarget(Landroid/view/View;Z)Landroid/transition/Transition;
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
}}
