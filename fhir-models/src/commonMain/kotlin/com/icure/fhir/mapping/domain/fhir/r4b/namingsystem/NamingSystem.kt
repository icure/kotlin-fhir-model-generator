//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.namingsystem

import com.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Resource
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4b.usagecontext.UsageContext
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * System of unique identification
 *
 * A curated namespace that issues unique symbols within that namespace for the identification of
 * concepts, people, devices, etc.  Represents a "System" used within the Identifier and Coding data
 * types.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param name Name for this naming system (computer friendly)
 * @param status draft | active | retired | unknown
 * @param kind codesystem | identifier | root
 * @param date Date last changed
 * @param publisher Name of the publisher (organization or individual)
 * @param responsible Who maintains system namespace?
 * @param type e.g. driver,  provider,  patient, bank etc.
 * @param description Natural language description of the naming system
 * @param usage How/where is it used
 */
@SerialName("NamingSystem")
@Serializable
public data class NamingSystem(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override val text: Narrative? = null,
  override val contained: List<Resource> = emptyList(),
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Name for this naming system (computer friendly)
   */
  public val name: String? = null,
  /**
   * draft | active | retired | unknown
   */
  public val status: String? = null,
  /**
   * codesystem | identifier | root
   */
  public val kind: String? = null,
  /**
   * Date last changed
   */
  public val date: String? = null,
  /**
   * Name of the publisher (organization or individual)
   */
  public val publisher: String? = null,
  public val contact: List<ContactDetail> = emptyList(),
  /**
   * Who maintains system namespace?
   */
  public val responsible: String? = null,
  /**
   * e.g. driver,  provider,  patient, bank etc.
   */
  public val type: CodeableConcept? = null,
  /**
   * Natural language description of the naming system
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * How/where is it used
   */
  public val usage: String? = null,
  public val uniqueId: List<NamingSystemUniqueId> = emptyList(),
) : DomainResource
