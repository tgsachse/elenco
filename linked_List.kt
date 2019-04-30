/* <!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta name="description" content="Linked List in Kotlin | Data Structures, A linked list is a linear collection of data elements, called nodes pointing to the next node by means of a pointer.">
		<meta name="keywords" content="Linked List in Kotlin | Data Structures, A linked list is a linear collection of data elements, called nodes pointing to the next node by means of a pointer.">
		<meta name="author" content="">	
		
		<title>Linked List in Kotlin | Data Structures</title>
    <link rel="icon" href="../images/favicon.png" type="image/gif">
    <link rel="apple-touch-icon" sizes="120x120" href="../images/favicon.png" />
    	
	<!-- Bootstrap core CSS-->
	<link href="../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<!-- Custom fonts for this template-->
	<!--<link href="https://fonts.googleapis.com/css?family=Montserrat:400,400i,500,500i,600,600i,700" rel="stylesheet">-->
	
	<!-- Page level plugin CSS-->
	
	<!-- Custom styles for this template-->
	<script src="../vendor/jquery/jquery.min.js"></script><link href="../css/sb-admin-a19.css" rel="stylesheet">
	
		<!--<link href="../styles/prism.css" rel="stylesheet" />-->

	
<!--<script type='text/javascript' src='../jquery.pack.js'></script>-->
<!--jscript start --><!--js code--><!--jsended-->
<!--side helpmenu on scroll start-->
<!--helpmenu code-->
<!--side helpmenu on scroll end-->

<!--jscript end --><!--css start --><!--css end-->
 



<!--Ld json Start-->
<!--og data start--><meta property='og:type' content='article'><meta property='og:title' content='Linked List in Kotlin | Data Structures'><meta property='og:site_name' content='CherCherTech'><meta property='og:url' content='https://chercher.tech/kotlin/linked-list-kotlin'><meta property='og:image' content='https://chercher.tech/tiles/linked-list-kotlin.png'><meta property='og:description' content='Linked List in Kotlin | Data Structures, A linked list is a linear collection of data elements, called nodes pointing to the next node by means of a pointer.'><!--og data end-->
<!--canonical--><link rel='canonical' href='https://chercher.tech/kotlin/linked-list-kotlin'>
<!--breadcrumb--><script type="application/ld+json">    {        "@context": "http://schema.org",        "@type": "BreadcrumbList",        "itemListElement": [{            "@type": "ListItem",            "position": 1,            "item": {               "@id": "https://chercher.tech",                "name": "Kotlin"            }        },{            "@type": "ListItem",            "position": 2,            "item": {               "@id": "https://chercher.tech",                "name": "Kotlin"            }        },  {            "@type": "ListItem",            "position": 3,            "item": {                "@id": "https://chercher.tech/kotlin/linked-list-kotlin",                "name": "Linked List in Kotlin | Data Structures"            }        }]    }</script>
<!--Logo--><script type="application/ld+json">{  "@context": "http://schema.org",  "@type": "Organization",  "url": "https://chercher.tech",  "logo": "https://chercher.tech/images/logo.png"}</script>
<!--Social profile--><script type="application/ld+json">{  "@context": "http://schema.org",  "@type": "Person",  "name": "karthiQ",  "url": "https://chercher.tech",  "sameAs": [    "https://www.facebook.com/seleniumwebdrivercom",    "https://in.linkedin.com/in/cherchertech"  ]}</script>
<!--Website--><script type="application/ld+json">{  "@context": "http://schema.org",  "@type": "WebSite", "url": "https://chercher.tech/kotlin/linked-list-kotlin","name": "Linked List in Kotlin | Data Structures", "author": {   "@type": "Person",  "name": "karthiq"}, "description": "Linked List in Kotlin | Data Structures, A linked list is a linear collection of data elements, called nodes pointing to the next node by means of a pointer.", "publisher": "chercher tech"}</script>
<!--Article--><script type="application/ld+json">    {        "@context": "http://schema.org",        "@type": "Article",        "mainEntityOfPage": {            "@type": "WebPage",            "@id": "https://chercher.tech/kotlin/linked-list-kotlin"        },        "headline": "Linked List in Kotlin | Data Structures",        "image": "https://chercher.tech/tiles/linked-list-kotlin",        "datePublished": "2017-11-14T14:03:12+00:00",        "dateModified": "2018-08-29T05:36:39+00:00",        "author": {            "@type": "Person",            "name": "CherCher Tech"        },        "publisher": {            "@type": "Organization",            "name": "CherCher Tech",            "logo": {                "@type": "ImageObject",                "url": "https://chercher.tech/images/favicon.png"            }        },        "description": "Linked List in Kotlin | Data Structures, A linked list is a linear collection of data elements, called nodes pointing to the next node by means of a pointer.",        "name": "Linked List in Kotlin | Data Structures",        "keywords": "Linked List in Kotlin | Data Structures, A linked list is a linear collection of data elements, called nodes pointing to the next node by means of a pointer."    }</script><!--Ld json End-->				

<!-- Google Tag Manager -->
<script>(function(w,d,s,l,i){w[l]=w[l]||[];w[l].push({'gtm.start':
new Date().getTime(),event:'gtm.js'});var f=d.getElementsByTagName(s)[0],
j=d.createElement(s),dl=l!='dataLayer'?'&l='+l:'';j.async=true;j.src=
'https://www.googletagmanager.com/gtm.js?id='+i+dl;f.parentNode.insertBefore(j,f);
})(window,document,'script','dataLayer','GTM-NNJSV86');</script>
<!-- End Google Tag Manager -->
</head>
	<body class="fixed-nav sticky-footer" id="page-top" onload="current();seturl();" 1>

<!--header starter--><header>    <nav class="navbar-expand-lg navbar-dark bg-dark" itemscope itemtype="https://schema.org/SiteNavigationElement" id="mainNav">
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav navbar-sidenav" id="exampleAccordion">
			<!--<input type="text" id="myInput" onkeyup="mySearch()" placeholder="Search Topics" title="Search Topics">-->
                <ul id="accordion" class="accordion">
				<li>
					<div class="link ">Basic<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="kotlin" title="kotlin ">Kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="basic-kotlin-project" title="kotlin ">Hello Mars</a></li>
					</ul>
				</li>
				<li>
					<div class="link ">Variables and their Data Types<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="variables-datatypes-kotlin" title="Variables in Kotlin">Variables in Kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="variables-datatypes-kotlin#static-dynamic-typing" title="Dynamic and Static Typing in Kotlin">Dynamic and Static Typing</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="variables-datatypes-kotlin#variable-types" title="Variable Types in Kotlin in Kotlin">Variable Types in Kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="variables-datatypes-kotlin#data-types" title="Data Types in Kotlin in Kotlin">Data Types in Kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="variables-datatypes-kotlin#type-inference" title="Type inference in Kotlin">Type inference</a></li>
					</ul>
				</li>
				<li>
					<div class="link ">Any | Unit | Nothing<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="any-unit-nothing-kotlin" title="Any in Kotlin">Any</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="any-unit-nothing-kotlin#unit" title="unit in Kotlin">Unit</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="any-unit-nothing-kotlin#kotlin" title="Nothing in Kotlin">Nothing</a></li>
					</ul>
				</li>
				<li>
					<div class="link ">Operators in Kotlin<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="kotlin-operators" title="Operators in Kotlin">Operators in Kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="kotlin-operators#arith" title="Arithmetic operators in Kotlin">Arithmetic operators</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="kotlin-operators#compare" title="Comparison Operators in Kotlin">Comparison Operators</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="kotlin-operators#assignment" title="Assignment Operators in Kotlin">Assignment Operators</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="kotlin-operators#logical" title="Logical Operators in Kotlin">Logical Operators</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="kotlin-operators#unary" title="Unary Operators in Kotlin">Unary Operators</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="kotlin-operators#equality" title="Equality Operators in Kotlin">Equality Operators</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="kotlin-operators#in" title="in Operator in Kotlin">in Operator</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="kotlin-operators#is" title="is Operator in Kotlin">is Operator</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="kotlin-operators#index" title="index Operator in Kotlin">index Operator</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="kotlin-operators#invoke" title="invoke Operator in Kotlin">invoke Operator</a></li>
					</ul>
				</li>
				<li>
					<div class="link ">Nullability<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="nullability-kotlin" title="Nullability in Kotlin">Nullability in kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="nullability-kotlin#safe" title="Safe Call Operator [?.] in Kotlin">Safe Call Operator [?.]</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="nullability-kotlin#elvis" title="Elvis Operator [?:] in Kotlin">Elvis Operator [?:]</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="nullability-kotlin#smart" title="Smart cast Operator [as?] in Kotlin">Smart cast Operator [as?]</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="nullability-kotlin#not-null" title="Not Null Assertion [!!] in Kotlin">Not Null Assertion [!!]</a></li>
					</ul>
				</li>
				<li>
					<div class="link ">Control Flow Statements<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="control-flow-kotlin" title="Control Flow statements in kotlin">Control Flow statements</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="control-flow-kotlin#if" title="if condition in kotlin">if condition in kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="control-flow-kotlin#exp" title="If..else as expression in kotlin">If..else as expression</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="control-flow-kotlin#when" title="When construct in kotlin">When construct</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="control-flow-kotlin#loop" title="Loops in Kotlin in kotlin">Loops in Kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="control-flow-kotlin#while" title="While Loop in Kotlin in kotlin">While Loop in Kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="control-flow-kotlin#do" title="do - while loop in kotlin in kotlin">do - while loop in kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="control-flow-kotlin#for" title="For Loop and types in Kotlin in kotlin">For Loop and types in Kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="control-flow-kotlin#break" title="Break and Continue in kotlin">Break and Continue</a></li>
					</ul>
				</li>
				<li>
					<div class="link ">Functions in kotlin<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="functions-kotlin" title="Functions in kotlin">Functions in kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="functions-kotlin#single" title="Single Expression Functions in kotlin">Single Expression Functions</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="functions-kotlin#unit" title="Unit Functions in Kotlin in kotlin">Unit Functions in Kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="functions-kotlin#parameters" title="Parameters in Kotlin Functions in kotlin">Parameters in Kotlin Functions</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="functions-kotlin#top" title="Top Level Functions in kotlin">Top Level Functions</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="functions-kotlin#member" title="Member Functions in Kotlin in kotlin">Member Functions in Kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="functions-kotlin#local" title="Local Functions in Kotlin in kotlin">Local Functions in Kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="functions-kotlin#call" title="Calling a function in kotlin">Calling a function</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="functions-kotlin#default" title="Default Parameters in kotlin">Default Parameters</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="functions-kotlin#vararg" title="Vararg in functions in kotlin">Vararg in functions</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="functions-kotlin#spread" title="Spread Operator (*) in kotlin">Spread Operator (*)</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="functions-kotlin#extension" title="Kotlin Extension Functions in kotlin">Kotlin Extension Functions</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="functions-kotlin#infix" title="infix functions in Kotlin in kotlin">infix functions in Kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="functions-kotlin#static" title="Static functions in Kotlin in kotlin">Static functions in Kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="functions-kotlin#questions" title="Basic Question in kotlin">Basic Question</a></li>
					</ul>
				</li>
				<li>
					<div class="link ">Kotlin Standard Functions<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="kotlin-standard-functions" title="Kotlin Standard Functions in kotlin">Kotlin Standard Functions</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="kotlin-standard-functions#apply" title="Apply in kotlin">Apply</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="kotlin-standard-functions#let" title="let in kotlin">let</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="kotlin-standard-functions#with" title="With in kotlin">With</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="kotlin-standard-functions#run" title="run in kotlin">run</a></li>
					</ul>
				</li>
				<li>
					<div class="link ">Operator Overloading<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="kotlin-operator-overloading" title="Operator Overloading in Kotlin">Operator Overloading</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="kotlin-operator-overloading#internal" title="Operators and internal functions in Kotlin">Operators and internal functions</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="kotlin-operator-overloading#arith" title="Overload Arithmetic operator in Kotlin">Overload Arithmetic operator</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="kotlin-operator-overloading#compound" title="Overload Compound Operators in Kotlin">Overload Compound Operators</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="kotlin-operator-overloading#unary" title="Overload Unary Operators in Kotlin">Overload Unary Operators</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="kotlin-operator-overloading#comparison" title="Comparison Operator Overloading in Kotlin">Comparison Operator Overloading</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="kotlin-operator-overloading#things" title="Things to remember in Kotlin">Things to remember</a></li>

					</ul>
				</li>
				<li>
					<div class="link ">Lambda & Higher Order Functions<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="lambda-kotlin" title="Lambda in Kotlin">Lambda in Kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="lambda-kotlin#param" title="Parameters with lambda in Kotlin">Parameters with lambda</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="lambda-kotlin#return" title="Return value in lambda in Kotlin">Return value in lambda</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="lambda-kotlin#higher-order" title="Higher Order Functions in Kotlin">Higher Order Functions</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="lambda-kotlin#it" title="it in kotlin lambdas in Kotlin">it in kotlin lambdas</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="lambda-kotlin#anonymous" title="Anonymous functions in Kotlin">Anonymous functions</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="lambda-kotlin#return" title="returns in lambdas in Kotlin">returns in lambdas</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="lambda-kotlin#nested" title="kotlin nested lambda in Kotlin">Nested Lambda</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="lambda-kotlin#receivers" title="kotlin lambdas with receivers in Kotlin">kotlin lambdas with receivers</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="lambda-kotlin#scope" title="kotlin lambdas with receivers in Kotlin">Variable Scope in Lambda</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="lambda-kotlin#return" title="kotlin lambdas with receivers in Kotlin">Returning function from function</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="lambda-kotlin#accept" title="kotlin lambdas with receivers in Kotlin">lambda accepting lambda</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="lambda-kotlin#vararg" title="Kotlin with vararg in Kotlin">Kotlin with vararg</a></li>
					</ul>
				</li>
				<li>
					<div class="link ">Kotlin Exceptions<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
					<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="exceptions-kotlin" title="Exceptions in Kotlin">Exceptions</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="exceptions-kotlin#error" title="Error in Kotlin">Error in kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="exceptions-kotlin#types" title="Types of Exceptions in Kotlin">Types of Exceptions</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="exceptions-kotlin#catch" title="Catching Exceptions  in Kotlin">Catching Exceptions </a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="exceptions-kotlin#throw" title="throw keyword in Kotlin">throw keyword</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="exceptions-kotlin#throws" title="throws annotation in Exceptions in Kotlin">throws annotation in Exceptions</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="exceptions-kotlin#throw-throws" title="throw vs throws in Kotlin">throw vs throws</a></li>
					</ul>
				</li>
				
				<li>
					<div class="link ">Object Oriented Programming<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
					<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="object-oriented-programming-kotlin" title="Object Oriented Programming">Object Oriented Programming</a></li>
					</ul>
				</li>
				
				<li>
					<div class="link ">Classes & Constructors<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="classes-constructors-kotlin" title="Classes in Kotlin">Classes</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="classes-constructors-kotlin#constuctor" title="Constructors in Kotlin">Constructors</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="classes-constructors-kotlin#default" title="Default Constructors in Kotlin">Default Constructors</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="classes-constructors-kotlin#no-pram" title="No-Param Constructors in Kotlin">No-Param Constructors</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="classes-constructors-kotlin#param" title="Parameterized Constructors in Kotlin">Parameterized Constructors</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="classes-constructors-kotlin#primary" title="Kotlins Primary Constructor in Kotlin">Kotlins Primary Constructor</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="classes-constructors-kotlin#init" title="Init Block in kotlin in Kotlin">Init Block in kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="classes-constructors-kotlin#default" title="Default Values in the Primary Constructor in Kotlin">Default Values in the Primary Constructor</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="classes-constructors-kotlin#secondary" title="Secondary Constructors in Kotlin">Secondary Constructors</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="classes-constructors-kotlin#inner-nested" title="Inner & Nested Classes in Kotlin in Kotlin">Inner & Nested Classes in Kotlin</a></li>
					</ul>
				</li>
				
				<li>
					<div class="link ">Properties & Initialization<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
					<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="properties-Initialization-kotlin" title="Properties in Kotlin">Properties</a></li>
					<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="properties-Initialization-kotlin#get-set" title="Getters and setter in Kotlin">Getters and setter</a></li>
					<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="properties-Initialization-kotlin#value" title="value in Kotlin">value</a></li>
					<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="properties-Initialization-kotlin#field" title="Backing Field  or field in Kotlin">Backing Field  or field</a></li>
					<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="properties-Initialization-kotlin#constants" title="Compile time constants in Kotlin">Compile time constants</a></li>
					<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="properties-Initialization-kotlin#init" title="Property/Variable Initialization in Kotlin">Property/Variable Initialization</a></li>
					<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="properties-Initialization-kotlin#lazy" title="Lazy initialization in Kotlin">Lazy initialization</a></li>
					<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="properties-Initialization-kotlin#lateinit" title="Late Init in Kotlin">Late Init</a></li>
					<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="properties-Initialization-kotlin#observable" title="Delegates Observable in Kotlin">Delegates Observable</a></li>

					
					</ul>
				</li>
				
				<li>
					<div class="link ">Inheritance<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="inheritance-kotlin" title="Inheritance in Kotlin">Inheritance</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="inheritance-kotlin#constructor" title="Constructor involvement in Kotlin">Constructor involvement</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="inheritance-kotlin#this-super" title="this() & super() in Kotlin">this() & super()</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="inheritance-kotlin#types" title="Types of inheritance in Kotlin">Types of inheritance</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="inheritance-kotlin#single" title="Single Level Inheritance in Kotlin">Single Level Inheritance</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="inheritance-kotlin#multi-level" title="Multi-level Inheritance in Kotlin">Multi-level Inheritance</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="inheritance-kotlin#hybrid" title="Hybrid Inheritance in Kotlin">Hybrid Inheritance</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="inheritance-kotlin#multiple" title="Multiple Inheritance in Kotlin">Multiple Inheritance</a></li>

					</ul>
				</li>
				
				<li>
					<div class="link ">Enums & Sealed Classes<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="sealed-classes-enums" title=" Enums  in Kotlin">ENUMS</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="sealed-classes-enums#prop" title=" Enum with Properties and functions  in Kotlin"> Enum with Properties and functions </a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="sealed-classes-enums#override" title=" Override Enums toString()  in Kotlin"> Override Enums toString() </a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="sealed-classes-enums#anonymous" title=" Kotlins Enums as Anonymous classes  in Kotlin"> Kotlins Enums as Anonymous classes </a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="sealed-classes-enums#enum-enum" title=" Enums inside Enums  in Kotlin"> Enums inside Enums </a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="sealed-classes-enums#when" title=" When construct with Enum  in Kotlin"> When construct with Enum </a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="sealed-classes-enums#sealed" title=" Sealed Classes  in Kotlin"> Sealed Classes </a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="sealed-classes-enums#when-sealed" title=" when with Sealed classes  in Kotlin"> when with Sealed classes </a></li>
					</ul>
				</li>
				<li>
					<div class="link ">Abstraction<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="interfaces-abstract-classes-kotlin" title="interfaces-abstract-classes-kotlin in Kotlin">Abstraction</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="interfaces-abstract-classes-kotlin#interface" title="interfaces-abstract-classes-kotlin in Kotlin">Interface in Kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="interfaces-abstract-classes-kotlin#abstract" title="interfaces-abstract-classes-kotlin in Kotlin">Abstract Classes</a></li>
					</ul>
				</li>
				<li>
					<div class="link ">Visibility/Access Modifiers<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="visibility-modifiers-kotlin" title="Access  Visibility modifiers">Access/Visibility Modifiers</a></li>
					</ul>
				</li>
				
				<li>
					<div class="link ">Generics in Kotlin<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="generics-kotlin" title="Generics in Kotlin">Generics</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="generics-kotlin#classes" title="Kotlin Generics with Classes in Kotlin">Kotlin Generics with Classes</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="generics-kotlin#functions" title="Generic Functions in Kotlin">Generic Functions</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="generics-kotlin#erasure" title="Generics at RunTime | Type erasure in Kotlin">Generics at RunTime | Type erasure</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="generics-kotlin#constraints" title="Generic Constraints in Kotlin">Generic Constraints</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="generics-kotlin#variance" title="Type Variance in Kotlin">Type Variance</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="generics-kotlin#projections" title="Type Projection in Kotlin">Type Projection</a></li>

					</ul>
				</li>
				
				
				<li>
					<div class="link ">Collections<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="collections-kotlin" title="collections-kotlin">Collections</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="list-collection-kotlin" title="list collections-kotlin">List Collections in Kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="set-collection-kotlin" title="set collections-kotlin">Set Collections in Kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="map-collection-kotlin" title="map collections-kotlin">Map Collections in Kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="manipulate-collections" title="manipulate-collections">Manipulate Collections</a></li>
						
					</ul>
				</li>
				
				<li>
					<div class="link ">Reflection<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="reflection-kotlin" title="Kotlin Reflection in Kotlin">Reflection</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="reflection-kotlin#reflection" title="Kotlin Reflection in Kotlin">Kotlin Reflection</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="reflection-kotlin#KClass" title="KClass in Kotlin Reflection in Kotlin">KClass in Kotlin Reflection</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="reflection-kotlin#constructor" title="Constructors with reflection in Kotlin">Constructors with reflection</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="reflection-kotlin#kfunction" title="KFunction in Kotlin Reflection in Kotlin">KFunction in Kotlin Reflection</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="reflection-kotlin#kproperty" title="KProperty in Kotlin">KProperty</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="reflection-kotlin#companion" title="Companion Objects in Kotlin">Companion Objects</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="reflection-kotlin#object" title="Instantiation/Object Creation in Kotlin">Instantiation/Object Creation</a></li>

					</ul>
				</li>
				
				
				<li>
					<div class="link ">File Read & Write<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="read-write-files-kotlin" title="Check File existence in Kotlin">File Operations</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="read-write-files-kotlin#existance" title="Check File existence in Kotlin">Check File existence</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="read-write-files-kotlin#create" title="Kotlin Create File in Kotlin">Kotlin Create File</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="read-write-files-kotlin#read" title="Read files in Kotlin in Kotlin">Read files in Kotlin</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="read-write-files-kotlin#write" title="Write content to files in Kotlin">Write content to files</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="read-write-files-kotlin#append" title="Append content in Kotlin">Append content</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="read-write-files-kotlin#copy" title="Copy a file into another in Kotlin">Copy a file into another</a></li>

					</ul>
				</li>
				<li>
					<div class="link ">Properties File<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="properties-file-kotlin" title="Read Properties File in kotlin">Read Properties File</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="properties-file-kotlin#write" title="Write Properties File  in kotlin">Write Properties File</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="properties-file-kotlin#read-all" title="Read all values in Properties File  in kotlin">Read all values in Properties File</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="properties-file-kotlin#multiple" title="Read Multiple Property Files  in kotlin">Read Multiple Property Files</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="properties-file-kotlin#map" title="Kotlin Map and Properties File  in kotlin">Kotlin Map and Properties File</a></li>
					</ul>
				</li>
				
				<li>
					<div class="link ">Read & Write Excel Files<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="read-write-excel-kotlin" title="Excel files in Kotlin">Excel Files </a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="read-write-excel-kotlin#terms" title="Apache POI famous Terms in Kotlin">Apache POI famous Terms</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="read-write-excel-kotlin#write" title="Write Excel in Kotlin">Write Excel</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="read-write-excel-kotlin#read" title="Read Excel in Kotlin">Read Excel</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="read-write-excel-kotlin#cell" title="Retrieving Cell values by CellType in Kotlin">Retrieving Cell values by CellType</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="read-write-excel-kotlin#all-value-column" title="Read all values from a specific Column in Kotlin">Read all values from Column</a></li>

					</ul>
				</li>
				
				<li>
					<div class="link ">CSV Files in kotlin<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="read-write-csv-files-kotlin" title="csv files in kotlin">CSV files</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="read-write-csv-files-kotlin#install-apche-csv" title="Apache Commons CSV Integration in Kotlin">Apache Commons CSV Integration</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="read-write-csv-files-kotlin#read-csv" title="Reading a CSV file with Column Index in kotlin">Reading a CSV file with Column Index</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="read-write-csv-files-kotlin#column-name" title="Reading a CSV file with Column Name in kotlin">Reading a CSV file with Column Name</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="read-write-csv-files-kotlin#csv-header" title="Reading a CSV file with Header in kotlin">Reading a CSV file with Header</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="read-write-csv-files-kotlin#create-csv" title="Generating a CSV file in kotlin">Create CSV file</a></li>
						
					</ul>
				</li>
				
				<li>
					<div class="link ">Data Structures<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="stack-kotlin" title="Stack in Kotlin">Stack</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="queue-kotlin" title="Queue in Kotlin">Queue</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="deque-kotlin" title="DeQueue in Kotlin">DeQue</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="linked-list-kotlin" title="linked list in Kotlin">Linked List</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="indexed-priority-queue" title="indexed priority Queue in Kotlin">Indexed Priority Queue</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="linear-search-kotlin" title="linear search in Kotlin">Linear Search</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="binary-search-kotlin" title="binary search in Kotlin">Binary Search</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="disjoint-set-kotlin" title="Disjoint disjoint Sort in Kotlin">Disjoin set</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="ordered-array-kotlin" title="Ordered Array  in Kotlin">Ordered Array</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="ordered-set-kotlin" title="shuffle-array-kotlin">Ordered Set</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="shuffle-array-kotlin" title="shuffle-array-kotlin">Shuffle Array</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="tree-kotlin" title="tree-kotlin">Tree</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="binary-tree-kotlin" title="binary-tree-kotlin">Binary Tree</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="binary-search-tree-kotlin" title="binary-searchtree-kotlin">Binary Search Tree</a></li>
					</ul>
				</li>
				
				<li>
					<div class="link ">Sorting<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="quick-sort-kotlin" title="Quick  sorting in Kotlin">Quicksort</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="merge-sort-kotlin" title="Merge  sorting in Kotlin">Merge  Sort</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="inplace-merge-sort-kotlin" title="In-place merge  sorting in Kotlin">In-place merge  Sort</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="insertion-sort-kotlin" title="Insertion  sorting in Kotlin">Insertion  Sort</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="selection-sort-kotlin" title="Selection  sorting in Kotlin">Selection  Sort</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="introsort-kotlin" title="Introsort in Kotlin">Introsort  Sort</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="shell-sort-kotlin" title="Shell  sorting in Kotlin">Shell  Sort</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="bubble-sort-kotlin" title="Bubble  sorting in Kotlin">Bubble  Sort</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="cycle-sort-kotlin" title="Cycle  sorting in Kotlin">Cycle  Sort</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="cocktail-sort-kotlin" title="Cocktail  sorting in Kotlin">Cocktail  Sort</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="strand-sort-kotlin" title="Strand  sorting in Kotlin">Strand  Sort</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="patience-sort-kotlin" title="Patience  sorting in Kotlin">Patience  Sort</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="comb-sort-kotlin" title="Comb  sorting in Kotlin">Comb  Sort</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="gnome-sort-kotlin" title="Gnome  sorting in Kotlin">Gnome  Sort</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="odd–even-sort-kotlin" title="Odd–even  sorting in Kotlin">Odd–even  Sort</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="pigeonhole-sort-kotlin" title="Pigeonhole  sorting in Kotlin">Pigeonhole  Sort</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="pancake-sort-kotlin" title="Pancake  sorting in Kotlin">Pancake  Sort</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="bogosort-kotlin" title="Bogo  sorting in Kotlin">Bogo  Sort</a></li>
					</ul>
				</li>
				
				
				<li>
					<div class="link ">Design Patterns<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="singleton-design-pattern-kotlin" title="binary search in Kotlin">SingleTon</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="visitor-design-pattern-kotlin" title="visitor-design-pattern-kotlin">Visitor Pattern</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="bridge-design-pattern-kotlin" title="bridge-design-pattern-kotlin">Bridge Pattern</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="adapter-design-pattern-kotlin" title="adapter-design-pattern-kotlin">Adapter Pattern</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="state-design-pattern-kotlin" title="state-design-pattern-kotlin">State Pattern</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="strategy-design-pattern-kotlin" title="strategy-design-pattern-kotlin">Strategy Pattern</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="iterator-design-pattern-kotlin" title="iterator-design-pattern-kotlin">Iterator Pattern</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="listener-design-pattern-kotlin" title="listener-design-pattern-kotlin">Listener Pattern</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="builder-design-pattern-kotlin" title="builder-design-pattern-kotlin">Builder Pattern</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="chain-of-responsibility-design-pattern-kotlin" title="chain-of-responsibility-design-pattern-kotlin">Chain of Responsibility Pattern</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="command-design-pattern-kotlin" title="Command Pattern in kotlin">Command Pattern</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="composite-design-pattern-kotlin" title="Composite Pattern in kotlin">Composite Pattern</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="facade-design-pattern-kotlin" title="facade Pattern in kotlin">Facade Pattern</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="decorator-design-pattern-kotlin" title="Decorator Pattern in kotlin">Decorator Pattern</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="factory-design-pattern-kotlin" title="Factory Pattern in kotlin">Factory Pattern</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="mediator-design-pattern-kotlin" title="Mediator Pattern in kotlin">Mediator Pattern</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="momento-design-pattern-kotlin" title="Momento Pattern in kotlin">Momento Pattern</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="observer-design-pattern-kotlin" title="Observer Pattern in kotlin">Observer Pattern</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="protection-proxy-design-pattern-kotlin" title="Protection Proxy Pattern in kotlin">Protection Proxy Pattern</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle();"   class="nav-link-text" href="prototype-design-pattern-kotlin" title="Prototype Pattern in kotlin">Prototype Pattern</a></li>
					</ul>
				</li>
				<li>
					<div class="link ">Kotlin Interview Questions<i class="fa fa-chevron-down "></i></div>
					<ul class="submenu ">
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle;"   class="nav-link-text"	href="armstrong-number"	title= "Write a program to find the given number is Armstrong number or not">Armstrong number or not</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle;"   class="nav-link-text"	href="check-whether-two-strings-are-anagram-of-each-other"	title= "Check whether two strings are anagram of each other">Anagrams</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle;"   class="nav-link-text"	href="common-elements-in-two-arrays"	title= "Write a kotlin program to find common elements between two arrays">Common elements between two arrays</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle;"   class="nav-link-text"	href="duplicate-string-character-count"	title= "Write a program to find out duplicate characters in a string">Duplicate characters in a string</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle;"   class="nav-link-text"	href="factorial"	title= "Write a kotlin Program to find Factorial of a Given Number">Factorial</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle;"   class="nav-link-text"	href="is-prime-number"	title= "Write a program to check the given number is a prime number or not">prime number or not</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle;"   class="nav-link-text"	href="isomorphic-strings"	title= "Check if two given strings are isomorphic to each other">Isomorphic strings</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle;"   class="nav-link-text"	href="kth-largest-element-in-an-array"	title= "Kth Largest Element in an array with kotlin">Kth Largest Element in an array</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle;"   class="nav-link-text"	href="perfect-number"	title= "Write a kotlin program to find perfect number or not">Perfect number or not</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle;"   class="nav-link-text"	href="program-to-check-if-strings-are-rotations-of-each-other"	title= "A Program to check if strings are rotations of each other or not">Strings are rotations of each other or not</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle;"   class="nav-link-text"	href="remove-common-characters-from-given-strings"	title= "Write a Kotlin Program to Remove Common Characters From Given Strings">Remove Common Characters From Strings</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle;"   class="nav-link-text"	href="reverse-given-number"	title= "Kotlin program to reverse a given number">Reverse a given number</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle;"   class="nav-link-text"	href="reverse-number"	title= "Write a kotlin program to reverse a string using recursive methods">Reverse a string [recursive]</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle;"   class="nav-link-text"	href="reverse-words-in-a-string"	title= "Reverse Words in a String using kotlin">Reverse Words in a String</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle;"   class="nav-link-text"	href="swap-two-numbers"	title= "How to swap two numbers without using temporary variable">Swap two numbers [without temp]</a></li>
						<li itemprop="name" ><a itemprop="url"  onclick="clicktoggle;"   class="nav-link-text"	href="two-max-numbers-in-array"	title= "Write a program to find top two maximum numbers in a array">Top two maximum numbers in a array</a></li>

					</ul>
				</li>
				
			</ul>
					<!--Scroll start--><div class='scroll'></div><!--Scroll end--><li class="nav-item " data-toggle="tooltip " data-placement="right ">
			</li>
		</ul>
	</div>
</nav>
</header><!--header ender-->


<!--Second header ender-->  <header>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top bigfont" id="mainNav">
    <button id='first' class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive1" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar"><b style="color:rgba(255, 255, 255, 0.83)">Tools</b></span>
    </button>
    <a class="navbar-brand" href="https://chercher.tech"><img src='../images/log.png'></a>
    <button id='second' class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar"><b style="color:rgba(255, 255, 255, 0.83)">Topics</b></span>
    </button>
 <div class="collapse navbar-collapse" id="navbarResponsive1">
      <ul class="navbar-nav">
	  <li class="nav-item">
          <a class="nav-link head" href="https://chercher.tech" id="head">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link head" href="https://chercher.tech/java/index-selenium-webdriver" id="head">Java Selenium</a>
        </li>
		<li class="nav-item" itemprop="name" >
          <a class="nav-link head" id="nav" href="https://chercher.tech/protractor/install-protractor" id="head">Protractor</a>
        </li>
		<li class="nav-item">
          <a class="nav-link head" href="https://chercher.tech/python/install-selenium-python" id="head">Selenium [Python]</a>
        </li>
		<li class="nav-item">
          <a class="nav-link head" href="https://chercher.tech/uipath/install-uipath" id="head">UiPath</a>
        </li>
		<li class="nav-item">
          <a class="nav-link head active white" href="https://chercher.tech/kotlin/kotlin" id="head">Kotlin</a>
        </li>
		<li class="nav-item">
          <a class="nav-link head" href="https://chercher.tech/kotlin-selenium/kotlin-selenium" id="head">Selenium-Kotlin</a>
        </li>
		<li class="nav-item">
          <a class="nav-link head" href="https://chercher.tech/java/junit5-mockito" id="head">JUnit Mockito</a>
        </li>
        <li class="nav-item">
          <a class="nav-link head" href="https://chercher.tech/neo4j/neo4j-install-basic-details" id="head">Neo4J</a>
        </li>
		<li class="nav-item">
          <a class="nav-link head" href="https://chercher.tech/videos" id="head">Videos</a>
        </li>
       <li class="nav-item" itemprop="name" >
          <!--<a itemprop="url" class="nav-link head" href="../index" id="head">Python</a>-->
        </li>
		
		<li class="nav-item" itemprop="name" >
          <a itemprop="url" class="nav-link head" id="nav" href="https://chercher.tech/contact.html" id="head">Contact Us</a>
        </li>
      </ul>
    </div>
	</nav>
	
 </header><!--second header finisher-->
<img  id='menu-image' width=55px; src="../images/icons/menu.png" onclick="clicktoggle();">
<img  id='search-image' width=40px; src="../images/icons/search.png">
<img  id='top-image' width=40px; src="../images/icons/top.png" onclick="takemetop();">
    <div class="content-wrapper">
			<div class="container-fluid">
				<!-- Breadcrumbs-->
				<ol class="breadcrumb nav">
					<li class="breadcrumb-item">
						<a href="#"><b>Kotlin</b></a>
					</li>
					<!--<li class="breadcrumb-item">
						<a href="index-selenium-webdriver">Java</a>
					</li>-->
					<li class="breadcrumb-item active update">Linked List in Kotlin</li>
				</ol>
				<div class="row">
					<div class="col-lg-8">
								<ol class="breadcrumb h1"><li class="breadcrumb-item"><h1 class="breadcrumb-item">Linked List in Kotlin | Data Structures</h1></li></ol>
		
							
							
							
<!--crum_add_start-111--><ins class="adsbygoogle" style="display:block; text-align:center;" data-ad-layout="in-article" data-ad-format="fluid" data-ad-client="ca-pub-2157680623515217" data-ad-slot="1813392315"></ins><script>(adsbygoogle = window.adsbygoogle || []).push({});</script><!--crum_add_end-->
							
							
							<!--<img class='img' src="../images/kotlin/xxxx.png" alt="xxxx" title="xxxx">-->
							<div class="card mb-3">
								<div class="card-header"><i class="headericon"></i> <h2>Linked List in Kotlin</h2></div>			
								<p>Linked List is a type of <u>Linear Data Structure</u> that is second mostly used data structure after array, which allocates memory dynamically at run time that is it doesn’t require any size initialization as in case of array.<br><br>
								
								
								LinkedList stores data in the forms of nodes, which is divided into two parts, first part stores the data and second part points to the next node by storing the address of that node.<br><br>
								
								
								
								
								
								<img class='img' src="../images/kotlin/linkedlist-in-kotlin.png" alt="linkedlist-in-kotlin" title="linkedlist-in-kotlin">
								
								
								
								<p>A linked list is a linear collection of data elements, called nodes pointing to the next node by means of a pointer.<br><br>
								It is a data structure consisting of a group of nodes which together represent a sequence. Under the simplest form, each node is composed of data and a reference (in other words, a link) to the next node in the sequence; more complex variants add additional links.<br><br>
								This structure allows for efficient insertion or removal of elements from any position in the sequence.
								
								
								</p>
								<!--crum_add_start-222--><ins class="adsbygoogle" style="display:block; text-align:center;" data-ad-layout="in-article" data-ad-format="fluid" data-ad-client="ca-pub-2157680623515217" data-ad-slot="1813392315"></ins><script>(adsbygoogle = window.adsbygoogle || []).push({});</script><!--crum_add_end-->
<pre><code class="language-java"> */
class Node&ltT>(value: T){
    var value:T = value
    var next: Node&ltT>? = null
    var previous:Node&ltT>? = null
}
class LinkedList&ltT> {
    private var head:Node&ltT>? = null
    var isEmpty:Boolean = head == null
    fun first():Node&ltT>? = head
    fun last(): Node&ltT>? {
            var node = head
            if (node != null){
                while (node?.next != null) {
                    node = node?.next
                }
                return node
            } else {
                return null
            }
    }
    fun count():Int {
        var node = head
        if (node != null){
            var counter = 1
            while (node?.next != null){
                node = node?.next
                counter += 1
            }
            return counter
        } else {
            return 0
        }
    }
    fun nodeAtIndex(index: Int) : Node&ltT>? {
        if (index >= 0) {
            var node = head
            var i = index
            while (node != null) {
                if (i == 0) return node
                i -= 1
                node = node.next
            }
        }
        return null
    }
    fun append(value: T) {
        var newNode = Node(value)
        var lastNode = this.last()
        if (lastNode != null) {
            newNode.previous = lastNode
            lastNode.next = newNode
        } else {
            head = newNode
        }
    }
    fun removeAll() {
        head = null
    }
    fun removeNode(node: Node&ltT>):T {
        val prev = node.previous
        val next = node.next
        if (prev != null) {
            prev.next = next
        } else {
            head = next
        }
        next?.previous = prev
        node.previous = null
        node.next = null
        return node.value
    }
    fun removeLast() : T? {
        val last = this.last()
        if (last != null) {
            return removeNode(last)
        } else {
            return null
        }
    }
    fun removeAtIndex(index: Int):T? {
        val node = nodeAtIndex(index)
        if (node != null) {
            return removeNode(node)
        } else {
            return null
        }
    }
    override fun toString(): String {
        var s = "["
        var node = head
        while (node != null) {
            s += "${node.value}"
            node = node.next
            if (node != null) { s += ", " }
        }
        return s + "]"
    }
}
fun main(args: Array&ltString>) {
    var ll = LinkedList&ltString>()
    ll.append("John")
    println(ll)
    ll.append("Carl")
    println(ll)
    ll.append("Zack")
    println(ll)
    ll.append("Tim")
    println(ll)
    ll.append("Steve")
    println(ll)
    ll.append("Peter")
    println(ll)
    print("\n\n")
    println("first item: ${ll.first()?.value}")
    println("last item: ${ll.last()?.value}")
    println("second item: ${ll.first()?.next?.value}")
    println("penultimate item: ${ll.last()?.previous?.value}")
    println("\n4th item: ${ll.nodeAtIndex(3)?.value}")
    println("\nthe list has ${ll.count()} items")
}			
/* </code></pre><p>								
							</div>
							
							<!--crum_add_start-333--><ins class="adsbygoogle" style="display:block; text-align:center;" data-ad-layout="in-article" data-ad-format="fluid" data-ad-client="ca-pub-2157680623515217" data-ad-slot="1813392315"></ins><script>(adsbygoogle = window.adsbygoogle || []).push({});</script><!--crum_add_end-->
							
							
							
							<!--<img class='img' src="../images/kotlin/xxxx.png" alt="xxxx" title="xxxx">-->
							<!--<div class="card mb-3">
								<div class="card-header"><i class="headericon"></i> <h2>cccccc</h2></div>			
								<p>
								</p>
							</div>-->
					
							
							
							<!--<img class='img' src="../images/kotlin/xxxx.png" alt="xxxx" title="xxxx">-->
							<!--<div class="card mb-3">
								<div class="card-header"><i class="headericon"></i> <h2>cccccc</h2></div>			
								<p>
								</p>
							</div>-->
							
							
							
							<!--<img class='img' src="../images/kotlin/xxxx.png" alt="xxxx" title="xxxx">-->
							<!--<div class="card mb-3">
								<div class="card-header"><i class="headericon"></i> <h2>cccccc</h2></div>			
								<p>
								</p>
							</div>-->
					
							
							
							<!--<img class='img' src="../images/kotlin/xxxx.png" alt="xxxx" title="xxxx">-->
							<!--<div class="card mb-3">
								<div class="card-header"><i class="headericon"></i> <h2>cccccc</h2></div>			
								<p>
								</p>
							</div>-->
							
							
							<!--<img class='img' src="../images/kotlin/xxxx.png" alt="xxxx" title="xxxx">-->
							<!--<div class="card mb-3">
								<div class="card-header"><i class="headericon"></i> <h2>cccccc</h2></div>			
								<p>
								</p>
							</div>-->
					
							
							
							<!--<img class='img' src="../images/kotlin/xxxx.png" alt="xxxx" title="xxxx">-->
							<!--<div class="card mb-3">
								<div class="card-header"><i class="headericon"></i> <h2>cccccc</h2></div>			
								<p>
								</p>
							</div>-->
							
							
							
							
					
							
									
							<!--start recommended-->
<div class="card mb-3">
	<h6 class='rr'>Recommended Reading</h6>
	<ul class='recommended'>
	<li><a target='_blank' href="kotlin" title="kotlin#java">Kotlin vs Java</a></li>
	<li><a target='_blank' href="generics-kotlin#functions" title="Generic Functions in Kotlin ">Generic Functions</a></li>
	<li><a target='_blank' href="variables-datatypes-kotlin#variable-types" title="Variable Types in Kotlin in kotlin ">Variable Types in Kotlin</a></li>
	<li><a target='_blank' href="nullability-kotlin#not-null" title="Not Null Assertion [!!] in kotlin ">Not Null Assertion [!!] in kotlin</a></li>
	<li><a target='_blank' href="read-write-csv-files-kotlin#install-apche-csv" title="Apache Commons CSV Integration in kotlin ">Apache Commons CSV Integration</a></li>
	<li><a target='_blank' href="interfaces-abstract-classes-kotlin" title="interfaces-abstract-classes-kotlin in Kotlin ">Abstraction</a></li>
	<li><a target='_blank' href="variables-datatypes-kotlin#data-types" title="Data Types in Kotlin in kotlin ">Data Types in Kotlin</a></li>
	<li><a target='_blank' href="annotations-kotlin" title="annotations-kotlin">Koltin Annotations</a></li>
	<li><a target='_blank' href="kotlin-standard-functions#with" title="With in kotlin">With in kotlin</a></li>
	<li><a target='_blank' href="kotlin-operators#index" title="index Operator in kotlin ">index Operator</a></li>
	<li><a target='_blank' href="classes-constructors-kotlin#inner-nested" title="Inner & Nested Classes in Kotlin in Kotlin ">Inner & Nested Classes in Kotlin</a></li>
	
	</ul>

	</p>
</div>
<!--end recommended-->



<!--author start--><!--aaaaaaaaaaaaa--><!--author end-->
					<!--<div class="card mb-3">
					<div id="" class="card-header">
						<b class="title" title='WebElement in Selenium'>You can also share knowledge by Adding a topic here</b>
					</div>
					<div class="card-body" id="comment_form">
						<form action="../cmt/post_topic.php" method='post'>
							<div class="form-group">
								<div class="form-row">
									<div class="col-md-6">
										<input class="form-control" id="pname"  required name='pname' type="text" aria-describedby="nameHelp" placeholder="Enter Name">
									</div>
									<div class="col-md-6">
										<input class="form-control" id='pemail' type='email' required  name='pemail' type="text" aria-describedby="nameHelp" placeholder="Enter email ( Mandatory )">
									</div>
									<div class="col-md-12">
										<input class="form-control" id="ptitle"  required name='ptitle' type="text" aria-describedby="title of the topic " placeholder="Enter Topic Title">
									</div>
								</div>
							</div>
							<div class="form-group">
								<div class="form-row">
								<textarea class="form-control" id="pabout" name='pabout' type="Comment" placeholder="About Author" rows=1;></textarea><br>
									<textarea class="form-control" id="pdescription" name='pdescription' type="Comment" placeholder="Description of the topic in elaborated way" rows=3;></textarea><br>
									<textarea class="form-control" id="pcode" name='pcode' type="Comment" placeholder="Write your Code here" rows=3;></textarea>
									<input type='hidden' name='ppage_id' id='ppage_id'/>
								</div>
							</div>
							<input class="btn btn-primary btn-block" type='submit' value='Post' onclick='seturl();'>
						</form>
					</div>
				</div>
				
					
					-->
<div class="card mb-3">
					<div class="card-header">
						<b class="title" title='comments and suggestions'>Comment /  Suggestion Section</b>
					</div>
					<div class="card-body" id="comment_form">
						<form action="../cmt/post_comment/" method='post'>
							<div class="form-group">
								<div class="form-row">
									<div class="col-md-6">
										
										<input class="form-control" id="name" name='name' type="text" aria-describedby="nameHelp" placeholder="Enter Name">
									</div>
									<div class="col-md-6">
										
										<input class="form-control" id='email' type='email'   , name='email' type="text" aria-describedby="nameHelp" placeholder="Enter email ( Optional for updates )">
									</div>
								</div>
							</div>
							<div class="form-group">
								<div class="form-row">
									
									<textarea class="form-control" id="comment_body" name='comment_body' type="Comment" placeholder="Comment" rows=3;></textarea>
									<input type='hidden' name='parent_id' id='parent_id' value='0'/>
									<input type='hidden' name='page_id' id='page_id'/>
								</div>
							</div>
							<input class="btn btn-primary btn-block" type='submit' value='Suggest Us' onclick='seturl();'>
						</form>
					</div>
				</div>
				<div class="card mb-3">
					<div class="card-header">
						<i class="abc"></i> <b class="title" id = 'cmts' title='Comments section for selenium webdriver'>Point our Mistakes and Post Your Suggestions</b>
					</div>
													</div>
                </div>
				
				<!--sidebar eclipse replace -->
				
                <div class="col-lg-4">
				<!--suggestion start--><form id='search'><input class='search' type="search" placeholder="Search my Knowledge"><ul class="suggestions"></ul></form><p></p><!-- suggestion ended-->
				
<!--meow start--><!--crum_add_start--><div class='ad-sticky'><ins class="adsbygoogle desktop" style="display:block" data-ad-client="ca-pub-2157680623515217" data-ad-slot="3662037985" data-ad-format="auto"></ins> <script>(adsbygoogle = window.adsbygoogle || []).push({});</script></div><!--crum_add_end-->
<script>
$(window).on("load", function () {
	$(".ad-sticky").addClass("fixad");  
});
setInterval(function(){ 
$(".ad-sticky").remove()
}, 60000);
</script><!--meow end-->
<!--ad me here starts--><!--just another ads--><!--ad me here ends-->	
<script>
var adsi=0
setInterval(function(){
	console.log(adsi)
	adsi++
	
	$(".ads-refresh")[0].innerHTML = $(".ads-refresh")[0].innerHTML
}, 10000)
</script>	
				</div>
				
				
				
				<!--eclipse code ends here-->
						</div>
					<!--- footer gies here-->
<!--full model start--><form hidden class="login" action="../cmt/post_subscribe/" method='post'>
<div class="form-group">
<div id="modalsubscribe">
  <div id="modal_content">
    <h1 class='subscribe'><strong>Subscribe</strong> to get latest updates.<h1>
    <h2 class='subscribe'>click x to close the popup</h2> 
    
	<input type='email' class="user" name="email" id='emailsubscribe' placeholder="Email">
	<input type="text" id='subscriberpage' style="display: none;" class="user" name="page_id">
	
	<input type='submit' class="btnsubscribe" value='Get Updates' id='downloadbtn'>
	<a href="#" class='closesubscribe' title="Close">✖</a> 
		
  </div>
</div> 
</div> 
</form><!--full model end-->
						<!--<script src="../footer.js"></script>-->
						<!-- <script src="javalist.js"></script> -->
					</script><script src="../styles/prism1.js"></script><script src="../vendor/jquery/jquery.min.js"></script>
						<!-- Global site tag (gtag.js) - Google Analytics -->
						<script async src="https://www.googletagmanager.com/gtag/js?id=UA-109980514-1"></script>
						<script>
							window.dataLayer = window.dataLayer || [];
							function gtag(){dataLayer.push(arguments);}
							gtag('js', new Date());
							gtag('config', 'UA-109980514-1');
						</script>
						
        <!--<script src="../vendor/jquery/jquery.min.js"></script>-->
						<!--<script src="../vendor/popper/popper.min.js"></script>-->
<!--Color header starts-->
<!--color header code-->
<!--Color header ends-->

<!--GoogleAdsStart-->
<script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
<script>
     (adsbygoogle = window.adsbygoogle || []).push({
          google_ad_client: "ca-pub-2157680623515217",
          enable_page_level_ads: true
     });
</script>
<!--GoogleAdsEnds-->
<!--hellobar-->
<!--kotlin ssscript-->
						<script src="../vendor/bootstrap/js/bootstrap.min.js"></script>
						<!--<script src="../vendor/jquery-easing/jquery.easing.min.js"></script>-->
						<script  src="../js/index8.js"></script><script  src="../js/sidebar-ads5.js"></script>
<!-- suggestion script start-->

<!-- suggestion script ended--> <!--<script src="../current.js"></script>-->
						<!--<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>-->
						<!--<script src="../js/sb-admin.min.js"></script>-->
						<!--<script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>-->
					</div>
				</body>
			</html> */
