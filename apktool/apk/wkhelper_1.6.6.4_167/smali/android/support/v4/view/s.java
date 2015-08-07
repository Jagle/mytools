package android.support.v4.view; class s { void a() { int a;
a=0;// .class public final Landroid/support/v4/view/s;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final a:Landroid/support/v4/view/v;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/view/u;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/u;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/u;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/u;);
a=0;//     sput-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/v;
a=0;// 
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/view/t;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/t;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/t;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/t;);
a=0;//     sput-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/v;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/view/MotionEvent;)I
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/view/MotionEvent;I)I
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/v;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/v;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/view/v;->a(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/view/MotionEvent;)I
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const v1, 0xff00
a=0;// 
a=0;//     #v1=(Char);
a=0;//     and-int/2addr v0, v1
a=0;// 
a=0;//     shr-int/lit8 v0, v0, 0x8
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/view/MotionEvent;I)I
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/v;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/v;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/view/v;->b(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static c(Landroid/view/MotionEvent;I)F
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/v;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/v;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/view/v;->c(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static c(Landroid/view/MotionEvent;)I
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/v;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/v;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/view/v;->a(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static d(Landroid/view/MotionEvent;I)F
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/v;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/v;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/view/v;->d(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// .end method
}}
