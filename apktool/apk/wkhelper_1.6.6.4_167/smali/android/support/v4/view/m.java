package android.support.v4.view; class m { void a() { int a;
a=0;// .class Landroid/support/v4/view/m;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/view/p;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/view/m;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(IIII)I
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     and-int/lit8 v2, p1, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     or-int v3, p2, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/lit8 v4, v3, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "bad arguments"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(Null);v2=(Integer);v3=(Uninit);v4=(Uninit);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);v3=(Integer);v4=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     xor-int/lit8 v0, v3, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/2addr p0, v0
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     return p0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     xor-int/lit8 v0, p1, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/2addr p0, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(I)I
a=0;//     .locals 2
a=0;// 
a=0;//     and-int/lit16 v0, p1, 0xc0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     or-int/lit8 v0, p1, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     and-int/lit8 v1, v0, 0x30
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     or-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     :cond_0
a=0;//     and-int/lit16 v0, v0, 0xf7
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     move v0, p1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/view/KeyEvent;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(I)Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/view/m;->a(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit16 v1, v1, 0xf7
a=0;// 
a=0;//     const/16 v2, 0x40
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/16 v3, 0x80
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-static {v1, v0, v2, v3}, Landroid/support/v4/view/m;->a(IIII)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     const/16 v3, 0x10
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/16 v4, 0x20
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-static {v1, v2, v3, v4}, Landroid/support/v4/view/m;->a(IIII)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-ne v1, v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public c(I)Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/view/m;->a(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit16 v0, v0, 0xf7
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
